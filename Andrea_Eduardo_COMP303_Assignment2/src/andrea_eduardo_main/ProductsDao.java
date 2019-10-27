/**
 * 
 */
package andrea_eduardo_main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * Students Names and Id's and Submitted date
 * Andrea de la Isla - 301039987
 * Eduardo Santana - 301048660
 * Submitted Date - 2019 - 10 - 27
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
		
		retVal.add(new Products("Coca-Cola", 230, 1, "Drinks"));
		retVal.add(new Products("Pepsi", 125, 1, "Drinks"));
		retVal.add(new Products("Hotdog", 652, 1, "Hot food"));
		retVal.add(new Products("Pizza", 412, 1, "Hot food"));
	
		return retVal;
	}
	
	public void seedDatabase()
	{
		List<Products> l = this.findAll();
		
		if(l == null || l.size() < 1) 
		{
			for(Products item : this.getProductList())
			{
				this.create(item);
			}	
		}
	}
	
	
}