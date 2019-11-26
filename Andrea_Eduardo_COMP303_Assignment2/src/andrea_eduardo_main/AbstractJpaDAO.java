/**
 * 
 */
package andrea_eduardo_main;

/**
 * Students Names and Id's and Submitted date
 * Andrea de la Isla - 301039987
 * Eduardo Santana - 301048660
 * Submitted Date - 2019 - 10 - 27
 */

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
this is an abstract class to have a generic repository. in order to not repeat code. 
 */
public abstract class AbstractJpaDAO <T extends Serializable> {

	private static EntityManagerFactory factory;
	
    protected Class<T> clazz;

    @PersistenceContext
    protected EntityManager entityManager;

	/**
	 * @param clazz
	 * @param entityManager
	 */
	public AbstractJpaDAO() {
		super();
		factory = Persistence.createEntityManagerFactory("MVCJPA");
		this.entityManager = factory.createEntityManager();
	}

	public final void setClazz(final Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(final int id) {
        return entityManager.find(clazz, id);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return entityManager.createQuery("select t from " + clazz.getName() + " t").getResultList();
    }

    public T create(final T entity) {
    	entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        return entity;
    }

    public T update(final T entity) {
    	entityManager.getTransaction().begin();
    	T t = entityManager.merge(entity);
        entityManager.getTransaction().commit();
        return t;
    }

    public void delete(final T entity) {
    	entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public void deleteById(final int entityId) {
    	entityManager.getTransaction().begin();
    	final T entity = findOne(entityId);
        delete(entity);
        entityManager.getTransaction().commit();
    }

}