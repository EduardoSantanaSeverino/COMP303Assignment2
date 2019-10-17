/**
 * 
 */
package andrea_eduardo_main;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author EduardoSantana
 *
 */
public class DataAccessLayerClass {


	private OrdersDao ordersDao = new OrdersDao();
	private CustomersDao customersDao = new CustomersDao();
	private ProductsDao productsDao = new ProductsDao();
	
	public List<Orders> getOrdersByCustomerId(int customerId)
	{
		return ordersDao.getListByCustomerId(customerId);
	}
	
	public Customers getCustomerByUserNameAndPassword(String userName, String password)
	{
		return customersDao.findByUserNameAndPassword(userName, password);
	}
	
	public Customers getCustomerByCustomerId(int customerId)
	{
		return customersDao.findOne(customerId);
	}
	
	public boolean isValidUser(Customers customer)
	{
		return customer != null;
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
			Customers customer = getCustomerByCustomerId(customerId);
			List<Orders> orders = getOrdersByCustomerId(customerId);
			
			retVal.setUser(customer);
			retVal.setOrders(orders);
			
		}
		return retVal;
	}
	
	private List<Products> getProductList()
	{
		List<Products> retVal = new ArrayList();
		
		retVal.add(new Products("Coca-Cola", 123, 1, "Drinks"));
		retVal.add(new Products("Pepsi", 125, 1, "Drinks"));
		retVal.add(new Products("Hotdog", 123, 1, "Hot food"));
		retVal.add(new Products("Pizza", 125, 1, "Hot food"));
	
		return retVal;
	}
	
	public void seedDatabase()
	{
		for(Products item : this.getProductList())
		{
			productsDao.create(item);
		}
	}
	
	public Customers insertCustomer(Customers customer)
	{
		return customersDao.create(customer);
	}
	
}
