/**
 * 
 */
package andrea_eduardo_main;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * Students Names and Id's and Submitted date
 * Andrea de la Isla - 301039987
 * Eduardo Santana - 301048660
 * Submitted Date - 2019 - 10 - 27
 */
@Repository
public class OrdersDao extends AbstractJpaDAO<Orders> {

	public OrdersDao() {
		super();
		setClazz(Orders.class);
		// TODO Auto-generated constructor stub
	}
	
    @SuppressWarnings("unchecked")
    public List<Orders> getListByCustomerId(int customerId) {
        return entityManager.createQuery("select o from " + clazz.getName() + " o where o.customerId = " + Integer.toString(customerId)).getResultList();
    }


}
