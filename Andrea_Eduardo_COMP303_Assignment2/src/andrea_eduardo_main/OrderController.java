/**
 * 
 */
package andrea_eduardo_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Students Names and Id's and Submitted date
 * Andrea de la Isla - 301039987
 * Eduardo Santana - 301048660
 * Submitted Date - 2019 - 10 - 27
 */
@Controller
public class OrderController {

	private SessionHelper sessionHelper = new SessionHelper();
	private OrdersDao ordersDao = new OrdersDao();
	private ProductsDao productsDao = new ProductsDao();
	
	/*Method to create order using the post method*/
	@RequestMapping(value = "/order/create", method = RequestMethod.POST)
	public ModelAndView create(
			@RequestParam(value = "customerId", required = true) int customerId,
			@RequestParam(value = "productId", required = true) int productId,
			@RequestParam(value = "orderDate", required = true) String orderDate,
			@RequestParam(value = "color", required = true) String color,
			@RequestParam(value = "comments", required = true) String comments,
			@RequestParam(value = "status", required = true) String status,
			@RequestParam(value = "amountPaid", required = true) int amountPaid,
			@RequestParam(value = "credictCardNumber", required = true) String credictCardNumber,
			@RequestParam(value = "credictCardExpDate", required = true) String credictCardExpDate,
			@RequestParam(value = "credictCardCode", required = true) String credictCardCode,
			@RequestParam(value = "credictCardName", required = true) String credictCardName,
			HttpServletRequest request)
	{
		Orders order = new Orders(
				customerId, 
				productId, 
				orderDate, 
				color, 
				comments, 
				status,
				amountPaid, 
				credictCardNumber, 
				credictCardExpDate, 
				credictCardCode,
				credictCardName);

		order = ordersDao.create(order);
		
		boolean isValid = order != null;
		
		if(isValid)
		{
			request.getSession().setAttribute("info_message", "Confirmation message: The Order Have been Completed and Payment have been applied successfully!");
		}
		else
		{
			request.getSession().setAttribute("error_message", "There were some errors trying to save your order, please talk to administrators at +1 (471) 562 - 5656 !");
		}
		
		return new ModelAndView("redirect:/home.html", new HashMap<>());
		
	}
	
	/*Method to edit order using the post method*/
	@RequestMapping(value = "/order/edit", method = RequestMethod.POST)
	public ModelAndView edit(
			@RequestParam(value = "orderId", required = true) int orderId,
			@RequestParam(value = "customerId", required = true) int customerId,
			@RequestParam(value = "productId", required = true) int productId,
			@RequestParam(value = "orderDate", required = true) String orderDate,
			@RequestParam(value = "color", required = true) String color,
			@RequestParam(value = "comments", required = true) String comments,
			@RequestParam(value = "status", required = true) String status,
			@RequestParam(value = "amountPaid", required = true) int amountPaid,
			@RequestParam(value = "credictCardNumber", required = true) String credictCardNumber,
			@RequestParam(value = "credictCardExpDate", required = true) String credictCardExpDate,
			@RequestParam(value = "credictCardCode", required = true) String credictCardCode,
			@RequestParam(value = "credictCardName", required = true) String credictCardName,
			HttpServletRequest request)
	{
		Orders order = new Orders(
				customerId, 
				productId, 
				orderDate, 
				color, 
				comments, 
				status,
				amountPaid, 
				credictCardNumber, 
				credictCardExpDate, 
				credictCardCode,
				credictCardName);

		order.setOrderId(orderId);
		order.setStatus("Updated");
		
		order = ordersDao.update(order);
		
		boolean isValid = order != null;
		
		if(isValid)
		{
			request.getSession().setAttribute("info_message", "Order Saved Correctly!");
		}
		else
		{
			request.getSession().setAttribute("error_message", "There were some errors trying to save your order, please talk to administrators at +1 (471) 562 - 5656 !");
		}
		
		return new ModelAndView("redirect:/home.html", new HashMap<>());
		
	}
	
	/*Method to cancel order using the post method*/
	@RequestMapping(value = "/order/cancel", method = RequestMethod.POST)
	public ModelAndView cancel(
			@RequestParam(value = "id", required = true) int id, 
			HttpServletRequest request)
	{

		boolean isValid = false;
		
		String errorMessage = "";
		
		Orders order = ordersDao.findOne(id);

		try {
			errorMessage = this.validateHasLessThan24Hours(order);
			isValid = (errorMessage == "");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if(isValid)
		{
			order.setStatus("Cancelled");
			
			order = ordersDao.update(order);
			
			request.getSession().setAttribute("info_message", "Order Cancelled Correctly!");
		}
		else
		{
			request.getSession().setAttribute("error_message", errorMessage);
		}
		
		return new ModelAndView("redirect:/home.html", new HashMap<>());
		
	}
	
	/* Private Method to validateHasLessThan24Hours*/
	private String validateHasLessThan24Hours(Orders order) throws ParseException
	{
		String retVal = "";
		
		Date d1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").parse(order.getOrderDate());  
		Date d2 =  new Date();
		
		long diff = d2.getTime() - d1.getTime();
		long diffHours = diff / (60 * 60 * 1000);
		
		if(diffHours >= 24)
		{
			retVal = "It has been more than 24 hours since this order was created, therefore you can not cancel either update it!, Total hours is:: " + String.valueOf(diffHours);
		}
		
		return retVal;
	}
	
	/*Method to render created order view using the get method */
	@RequestMapping(value = "/create_order", method = RequestMethod.GET)
	public ModelAndView create_order(HttpServletRequest request)
	{
		ModelAndView view = null;
		LoggedUserViewModel model = sessionHelper.getCustomerFromSession(request);
		if(model == null || model.getUser() == null || model.getUser().getCustomerId() < 1)
		{
			return new ModelAndView("redirect:/", new HashMap<>());
		}
		view = new ModelAndView("create_order");
		view.addObject("model", model);
		view.addObject("products", productsDao.findAll());
		return view;
	}
	
	/*Method to render edit order view using the get method*/
	@RequestMapping(value = "/edit_order", method = RequestMethod.GET)
	public ModelAndView edit_order(@RequestParam(value = "id", required = true) int id, HttpServletRequest request)
	{

		Orders order = ordersDao.findOne(id);
		
		LoggedUserViewModel model = sessionHelper.getCustomerFromSession(request);
		
		if(model == null || model.getUser() == null || model.getUser().getCustomerId() < 1) // Validate if is logged in
		{
			return new ModelAndView("redirect:/", new HashMap<>());
		}

		try 
		{
			String errorMessage = this.validateHasLessThan24Hours(order);
			if(errorMessage != "") // Validate if the order has more than 24 hours created.
			{
				request.getSession().setAttribute("error_message", errorMessage);
				return new ModelAndView("redirect:/home.html", new HashMap<>());
			}
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		ModelAndView view = new ModelAndView("edit_order");
		view.addObject("model", model);
		view.addObject("order", order);
		view.addObject("products", productsDao.findAll());
		
		return view;
	}
	
}
