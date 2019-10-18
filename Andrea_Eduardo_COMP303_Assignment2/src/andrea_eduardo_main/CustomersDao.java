/**
 * 
 */
package andrea_eduardo_main;

import java.util.List;

import javax.persistence.Query;

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
		
		Query query = entityManager.createQuery("select c from " + clazz.getName() + " c where c.username = :un and c.password = :pw");
		
		query.setParameter("un", userName);
		query.setParameter("pw", password);
		
		List<Customers> l = query.getResultList();
		
		if(l != null && !l.isEmpty()) {
			return this.findOne(l.get(0).getCustomerId());
		}
		
        return null;
    }


}