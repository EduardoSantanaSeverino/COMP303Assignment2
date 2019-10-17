/**
 * 
 */
package andrea_eduardo_main;

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
public class AccountsController {

	private DataAccessLayerClass dataAccess = new DataAccessLayerClass();
	
	
	@RequestMapping(value = "/accounts/login", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password,
			HttpServletRequest request)
	{
 
		 
		ModelAndView view = null;
		Object model = null;
		
		Customers customer = dataAccess.getCustomerByUserNameAndPassword(username, password);
		boolean isValid = dataAccess.isValidUser(customer);
		
		if(isValid)
		{
			request.getSession().setAttribute("customerId", customer.getCustomerId());
			view = new ModelAndView("home");
			model = dataAccess.getLoggetUserViewModelByCustomerId(customer.getCustomerId());
			
		}
		else
		{
			request.getSession().setAttribute("customerId", 0);
			view = new ModelAndView("index");
			model = new LoginViewModel(username, password, "Username and Password does not Macth in our records database!");
		}
		
		view.addObject("model", model);
		return view;
		
	}

	@RequestMapping(value = "/accounts/register", method = RequestMethod.POST)
	public ModelAndView register(
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "firstname", required = true) String firstname,
			@RequestParam(value = "lastname", required = true) String lastname,
			@RequestParam(value = "address", required = true) String address,
			@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "postalCode", required = true) String postalCode,
			@RequestParam(value = "phone", required = true) String phone,
			HttpServletRequest request)
	{
 
		Customers customer = new Customers(username, password, firstname, lastname, address, city, postalCode, phone);
		ModelAndView view = null;
		Object model = null;
		
		customer = dataAccess.insertCustomer(customer);
		
		boolean isValid = dataAccess.isValidUser(customer);
		
		if(isValid)
		{
			request.getSession().setAttribute("customerId", customer.getCustomerId());
			view = new ModelAndView("home");
			model = dataAccess.getLoggetUserViewModelByCustomerId(customer.getCustomerId());
			
		}
		else
		{
			request.getSession().setAttribute("customerId", 0);
			view = new ModelAndView("index");
			model = new LoginViewModel(username, password, "Username and Password does not Macth in our records database!");
		}
		
		view.addObject("model", model);
		return view;
		
	}

}
