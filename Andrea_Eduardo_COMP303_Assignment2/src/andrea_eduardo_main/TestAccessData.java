/**
 * 
 */
package andrea_eduardo_main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

/**
 * @author EduardoSantana
 *
 */
public class TestAccessData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		testInsert();
		
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
			System.out.println(item.getComments());
		}
		
	}
}
