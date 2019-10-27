/**
 * 
 */
package andrea_eduardo_main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * Students Names and Id's and Submitted date
 * Andrea de la Isla - 301039987
 * Eduardo Santana - 301048660
 * Submitted Date - 2019 - 10 - 27
 */
public class SessionHelper {

	private OrdersDao ordersDao;
	private CustomersDao customersDao;

	public SessionHelper() {
		// TODO Auto-generated constructor stub
		ordersDao = new OrdersDao();
		customersDao = new CustomersDao();
	}
	
	public LoggedUserViewModel getCustomerFromSession(HttpServletRequest request)
	{
		ordersDao = new OrdersDao();
		customersDao = new CustomersDao();
		
		LoggedUserViewModel retVal = new LoggedUserViewModel();
		
		Object objectCustomerId = request.getSession().getAttribute("customerId");
		
		if(objectCustomerId != null)
		{
			
			int intCustomerId = Integer.parseInt(String.valueOf(objectCustomerId));
			
			retVal = getLoggetUserViewModelByCustomerId(intCustomerId);
			
		}
		
		return retVal;
		
	}
	
	public String getErrorMessage(HttpServletRequest request)
	{
		Object retVal = request.getSession().getAttribute("error_message");
		request.getSession().setAttribute("error_message", "");
		return String.valueOf(retVal);
	}
	
	public String getInfoMessage(HttpServletRequest request)
	{
		Object retVal = request.getSession().getAttribute("info_message");
		request.getSession().setAttribute("info_message", "");
		return String.valueOf(retVal);
	}

	public LoggedUserViewModel getLoggetUserViewModelByCustomerId(int customerId)
	{
		ordersDao = new OrdersDao();
		customersDao = new CustomersDao();
		
		LoggedUserViewModel retVal = new LoggedUserViewModel();
		if(customerId > 0)
		{
			Customers customer = customersDao.findOne(customerId);
			List<Orders> orders = ordersDao.getListByCustomerId(customerId);
			
			retVal.setUser(customer);
			retVal.setOrderList(orders);
			
		}
		return retVal;
	}

}
