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
 * Students Names and Id's and Submitted date
 * Andrea de la Isla - 301039987
 * Eduardo Santana - 301048660
 * Submitted Date - 2019 - 10 - 27
 */
@Controller
public class AccountsController {

	private CustomersDao customersDao = new CustomersDao();
	private ProductsDao productsDao = new ProductsDao();

	/*Method to login using the post method*/
	@RequestMapping(value = "/accounts/login", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password,
			HttpServletRequest request)
	{
		
		Customers customer = customersDao.findByUserNameAndPassword(username, password);
		boolean isValid = customer != null;
		
		if(isValid)
		{
			request.getSession().setAttribute("customerId", customer.getCustomerId());
			return new ModelAndView("redirect:/home.html", new HashMap<>());
		}
		else
		{
			return new ModelAndView("redirect:/index.jsp", new HashMap<>());
		}
		
	}
	
	/*Method to register using the post method*/
	@RequestMapping(value = "/accounts/register", method = RequestMethod.POST)
	public ModelAndView register(
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "firstname", required = true) String firstname,
			@RequestParam(value = "lastname", required = true) String lastname,
			@RequestParam(value = "address", required = true) String address,
			@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "postalCode", required = true) String postalCode,
			@RequestParam(value = "email", required = true) String email,
			HttpServletRequest request)
	{
		
		Customers customer = new Customers(username, password, firstname, lastname, address, city, postalCode, email);

		customer = customersDao.create(customer);
		
		boolean isValid = customer != null;
		
		if(isValid)
		{
			productsDao.seedDatabase();
			
			request.getSession().setAttribute("customerId", customer.getCustomerId());
			return new ModelAndView("redirect:/home.html", new HashMap<>());
			
		}
		else
		{
			return new ModelAndView("redirect:/index.jsp", new HashMap<>());
		}
		
	}

}
