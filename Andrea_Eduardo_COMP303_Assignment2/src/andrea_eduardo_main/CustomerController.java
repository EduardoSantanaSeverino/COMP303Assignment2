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
public class CustomerController {

	private SessionHelper sessionHelper = new SessionHelper();
	private CustomersDao customersDao = new CustomersDao();
	
	@RequestMapping(value = "/customer/edit", method = RequestMethod.POST)
	public ModelAndView edit_customer(
			@RequestParam(value = "customerId", required = true) int customerId,
			@RequestParam(value = "address", required = true) String address,
			@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "firstname", required = true) String firstname,
			@RequestParam(value = "lastname", required = true) String lastname,
			@RequestParam(value = "postalCode", required = true) String postalCode,
			HttpServletRequest request)
	{
		Customers customer = customersDao.findOne(customerId);
		
		customer.setFirstname(firstname);

		customer.setLastname(lastname);

		customer.setAddress(address);

		customer.setEmail(email);

		customer.setCity(city);

		customer.setPostalCode(postalCode);
		
		customer = customersDao.update(customer);
		
		boolean isValid = customer != null;
		
		if(isValid)
		{
			request.getSession().setAttribute("info_message", "Information Saved Correctly!");
		}
		else
		{
			request.getSession().setAttribute("error_message", "There were some errors trying to save your information, please talk to administrators at +1 (471) 562 - 5656 !");
		}
		return new ModelAndView("redirect:/home.html", new HashMap<>());	
		
	}
	
	@RequestMapping(value = "/edit_customer", method = RequestMethod.GET)
	public ModelAndView edit_customer(@RequestParam(value = "customerId", required = true) int customerId, HttpServletRequest request)
	{
		Customers customer = customersDao.findOne(customerId);
		ModelAndView view = null;
		LoggedUserViewModel model = sessionHelper.getCustomerFromSession(request);
		if(model == null || model.getUser() == null || model.getUser().getCustomerId() < 1)
		{
			return new ModelAndView("redirect:/", new HashMap<>());
		}
		view = new ModelAndView("edit_customer");
		view.addObject("model", model);
		view.addObject("customer", customer);
		view.addObject("customer", customersDao.findOne(customerId));
		return view;
	}
}