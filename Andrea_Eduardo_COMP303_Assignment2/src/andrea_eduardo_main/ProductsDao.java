/**
 * 
 */
package andrea_eduardo_main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author EduardoSantana
 *
 */
@Repository
public class ProductsDao extends AbstractJpaDAO<Products> {

	/**
	 * 
	 */
	public ProductsDao() {
		super();
		setClazz(Products.class);
		// TODO Auto-generated constructor stub
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
			this.create(item);
		}
	}
	
	
}