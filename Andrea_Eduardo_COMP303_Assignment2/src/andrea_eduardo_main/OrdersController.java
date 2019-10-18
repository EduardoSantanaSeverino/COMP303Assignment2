/**
 * 
 */
package andrea_eduardo_main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author EduardoSantana
 *
 */
@Controller
public class OrdersController {

	private SessionHelper sessionHelper = new SessionHelper();
	
	@RequestMapping(value = "/edit_order", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request)
	{
		ModelAndView view = null;
		Object model = sessionHelper.getCustomerFromSession(request);
		view = new ModelAndView("edit_order");
		view.addObject("model", model);
		return view;
	}
	
}
