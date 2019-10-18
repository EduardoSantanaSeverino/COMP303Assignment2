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
		ModelAndView view = null;
		Object model = sessionHelper.getCustomerFromSession(request);
		view = new ModelAndView("home");
		view.addObject("model", model);
		return view;
	}
	
	
}
