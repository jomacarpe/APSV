/**
 * 
 */
package es.upm.dit.apsv.webLab.dao;

import org.hibernate.Session;

import es.upm.dit.apsv.webLab.model.*;

/**
 * @author josemariacarmonaperez
 *
 */
public class PublicationDAOImpl implements PublicationDAO {

	private static PublicationDAOImpl instance;

	/**
	 * 
	 */
	public PublicationDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static PublicationDAOImpl getInstance() {
		if (instance == null)
			instance = new PublicationDAOImpl();
		return instance;
	}
	
	@Override
	public Publication create (Publication u) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(u);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
		return u;
	}
	
	@Override
	public Publication read (Publication r) {
		Session session = SessionFactoryService.get().openSession();
		Publication res = new Publication();
		try {
			res = (Publication) session.createQuery("select r from Publication r where r.id= :id").setParameter("id", r.getId()).uniqueResult();
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
		return res;
	}
	
	@Override
	public Publication update (Publication u) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(u);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
		return u;
	}
	
	@Override
	public Publication delete (Publication u) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(u);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
		return u;
	}

}
