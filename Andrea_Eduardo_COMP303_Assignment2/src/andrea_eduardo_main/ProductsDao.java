/**
 * 
 */
package andrea_eduardo_main;

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

}