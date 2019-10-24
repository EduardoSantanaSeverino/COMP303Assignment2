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
	 * @return the orderList
	 */
	public List<Orders> getOrderList() {
		return orderList;
	}
	/**
	 * @param orderList the orderList to set
	 */
	public void setOrderList(List<Orders> orders) {
		this.orderList = orders;
	}
	private Customers user;
	private List<Orders> orderList;
	
	/**
	 * 
	 */
	public LoggedUserViewModel() {
		// TODO Auto-generated constructor stub
	}

	
}
