/**
 * 
 */
package andrea_eduardo_main;

import java.util.HashMap;
import java.util.Map;

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
public class HomeController {

	private SessionHelper sessionHelper = new SessionHelper();
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request)
	{
		
		LoggedUserViewModel model = sessionHelper.getCustomerFromSession(request);
		
		if(model == null || model.getUser() == null || model.getUser().getCustomerId() < 1)
		{
			return new ModelAndView("redirect:/", new HashMap<>());
		}
		
		boolean show_orders = model.getOrderList().size() > 0;
		String error_message = sessionHelper.getErrorMessage(request);
		String info_message = sessionHelper.getInfoMessage(request);
		
		ModelAndView view = null;
		view = new ModelAndView("home");
		view.addObject("model", model);
		view.addObject("show_orders", show_orders);
		view.addObject("error_message", error_message);
		view.addObject("info_message", info_message);
		
		return view;
	}
	
	
}
