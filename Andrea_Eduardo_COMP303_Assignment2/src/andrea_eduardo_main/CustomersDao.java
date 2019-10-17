/**
 * 
 */
package andrea_eduardo_main;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author EduardoSantana
 *
 */
@Repository
public class CustomersDao extends AbstractJpaDAO<Customers> {

	/**
	 * 
	 */
	public CustomersDao() {
		super();
		setClazz(Customers.class);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
    public Customers findByUserNameAndPassword(String userName, String password) {
		
		List<Customers> l = entityManager.createQuery("select o from " + clazz.getName() + " o where o.username = '" + userName + "'").getResultList();
		
		if(l != null && !l.isEmpty()) {
			return this.findOne(l.get(0).getCustomerId());
		}
		
        return null;
    }


}