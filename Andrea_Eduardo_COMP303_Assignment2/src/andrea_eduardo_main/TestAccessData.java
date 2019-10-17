/**
 * 
 */
package andrea_eduardo_main;

import java.util.List;

/**
 * @author EduardoSantana
 *
 */
public class TestAccessData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataAccessLayerClass dataAccess = new DataAccessLayerClass();
		
		List<Orders> l = dataAccess.getOrdersByCustomerId(1);
		
		for(Orders item: l)
		{
			System.out.println(item.getComments());
		}
		
	}

}
