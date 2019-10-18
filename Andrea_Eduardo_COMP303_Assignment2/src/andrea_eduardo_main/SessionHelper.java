/**
 * 
 */
package andrea_eduardo_main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * @author EduardoSantana
 *
 */
public class SessionHelper {

	private OrdersDao ordersDao = new OrdersDao();
	private CustomersDao customersDao = new CustomersDao();

	public SessionHelper() {
		// TODO Auto-generated constructor stub
	}
	
	public LoggedUserViewModel getCustomerFromSession(HttpServletRequest request)
	{
		LoggedUserViewModel retVal = new LoggedUserViewModel();
		
		Object objectCustomerId = request.getSession().getAttribute("customerId");
		
		if(objectCustomerId != null)
		{
			
			int intCustomerId = Integer.parseInt(String.valueOf(objectCustomerId));
			
			retVal = getLoggetUserViewModelByCustomerId(intCustomerId);
			
		}
		
		return retVal;
		
	}

	public LoggedUserViewModel getLoggetUserViewModelByCustomerId(int customerId)
	{
		LoggedUserViewModel retVal = new LoggedUserViewModel();
		if(customerId > 0)
		{
			Customers customer = customersDao.findOne(customerId);
			List<Orders> orders = ordersDao.getListByCustomerId(customerId);
			
			retVal.setUser(customer);
			retVal.setOrders(orders);
			
		}
		return retVal;
	}

}
