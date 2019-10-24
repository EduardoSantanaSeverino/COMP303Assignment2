/**
 * 
 */
package andrea_eduardo_main;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author EduardoSantana
 *
 */
@Controller
public class OrderController {

	private SessionHelper sessionHelper = new SessionHelper();
	private OrdersDao ordersDao = new OrdersDao();
	
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
			request.getSession().setAttribute("info_message", "Order Saved Correctly!");
		}
		else
		{
			request.getSession().setAttribute("error_message", "There were some errors trying to save your order, please talk to administrators at +1 (471) 562 - 5656 !");
		}
		
		return new ModelAndView("redirect:/home.html", new HashMap<>());
		
	}
	
	@RequestMapping(value = "/create_order", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request)
	{
		ModelAndView view = null;
		LoggedUserViewModel model = sessionHelper.getCustomerFromSession(request);
		if(model == null || model.getUser() == null || model.getUser().getCustomerId() < 1)
		{
			return new ModelAndView("redirect:/", new HashMap<>());
		}
		view = new ModelAndView("create_order");
		view.addObject("model", model);
		return view;
	}
	
}
