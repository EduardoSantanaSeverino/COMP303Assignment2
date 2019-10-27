/**
 * 
 */
package andrea_eduardo_main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

/**
 * Students Names and Id's and Submitted date
 * Andrea de la Isla - 301039987
 * Eduardo Santana - 301048660
 * Submitted Date - 2019 - 10 - 27
 */
public class TestAccessData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testLoginUser();
	}
	
	public static void testOther()
	{
		SessionHelper sessionHelper = new SessionHelper();
		
		try
		{
			LoggedUserViewModel loginModel = sessionHelper.getLoggetUserViewModelByCustomerId(1);
			LoggedUserViewModel loginModel2;
			loginModel2 = null;
		}
		catch (Exception ex)
		{
			String me = ex.getMessage();
			System.out.println(me);
		}
		
	}
	
	public static void testInsert()
	{
		CustomersDao customersDao = new CustomersDao();
		 Map<String, String> map = new HashMap<>();
		 map.put("username", "username123");
		 map.put("password", "password123");
		 map.put("firstname", "firstname123");
		 map.put("lastname", "lastname123");
		 map.put("address", "address123");
		 map.put("city", "city123");
		 map.put("postalCode", "postalCode123");
		 map.put("email", "email123");
		    
		Customers customer = new Customers(map.get("username"), map.get("password"), map.get("firstname"), map.get("lastname"), map.get("address"), map.get("city"), map.get("postalCode"), map.get("email"));
		
		customer = customersDao.create(customer);
		
		String asdf = "";
		asdf = "";
	
		
	}

	public static void testGetOrders()
	{
		OrdersDao ordersDao = new OrdersDao();
		
		List<Orders> l = ordersDao.getListByCustomerId(1);
		
		for(Orders item: l)
		{
			System.out.println(item.getColor());
		}
		
	}
	
	public static void testLoginUser()
	{
		CustomersDao customersDao = new CustomersDao();
		Customers customer = customersDao.findByUserNameAndPassword("asdf4", "asdf4");
		boolean isValid = customer != null;
		
	}
}
