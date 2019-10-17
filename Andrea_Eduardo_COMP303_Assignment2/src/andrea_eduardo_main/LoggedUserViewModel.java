/**
 * 
 */
package andrea_eduardo_main;

import java.util.List;

/**
 * @author EduardoSantana
 *
 */
public class LoggedUserViewModel {

	/**
	 * @return the user
	 */
	public Customers getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(Customers user) {
		this.user = user;
	}
	/**
	 * @return the orders
	 */
	public List<Orders> getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	private Customers user;
	private List<Orders> orders;
	/**
	 * 
	 */
	public LoggedUserViewModel() {
		// TODO Auto-generated constructor stub
	}

	
}
