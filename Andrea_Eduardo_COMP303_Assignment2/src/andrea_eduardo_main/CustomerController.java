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
	
	@RequestMapping(value = "/customer/create", method = RequestMethod.POST)
	public ModelAndView create(
			@RequestParam(value = "address", required = true) String address,
			@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "firstname", required = true) String firstname,
			@RequestParam(value = "lastname", required = true) String lastname,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "postalcode", required = true) String postalcode,
			@RequestParam(value = "username", required = true) String username,
			HttpServletRequest request)
	{
		
		Customers customer = new Customers(
				address, 
				city, 
				email, 
				firstname, 
				lastname, 
				password,
				postalcode, 
				username);

		customer = customersDao.create(customer);
		
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
	public ModelAndView index(HttpServletRequest request)
	{
		ModelAndView view = null;
		LoggedUserViewModel model = sessionHelper.getCustomerFromSession(request);
		if(model == null || model.getUser() == null || model.getUser().getCustomerId() < 1)
		{
			return new ModelAndView("redirect:/", new HashMap<>());
		}
		view = new ModelAndView("edit_customer");
		view.addObject("model", model);
		return view;
	}
	
}
