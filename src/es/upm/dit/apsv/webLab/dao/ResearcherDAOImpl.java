/**
 * 
 */
package es.upm.dit.apsv.webLab.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.apsv.webLab.model.Publication;
import es.upm.dit.apsv.webLab.model.Researcher;

/**
 * @author josemariacarmonaperez
 *
 */
public class ResearcherDAOImpl implements ResearcherDAO {

	private static ResearcherDAOImpl instance;

	public ResearcherDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public static ResearcherDAOImpl getInstance() {
		if (instance == null)
			instance = new ResearcherDAOImpl();
		return instance;
	}

	@Override
	public Researcher create (Researcher u) {
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
	public Researcher read (String id) {
		Session session = SessionFactoryService.get().openSession();
		Researcher res = new Researcher();
		try {
			res = (Researcher) session.createQuery("select r from Researcher r where r.id= :id").setParameter("id", id).uniqueResult();
			
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
		return res;
	}
	
//	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Researcher> readAll () {
		Session session = SessionFactoryService.get().openSession();
		List<Researcher> res = new ArrayList<Researcher>();
		try {
			res = (List<Researcher>) session.createQuery("FROM Researcher").getResultList(); //createSQLQuery("SELECT * FROM Researcher").list();		
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
		return res;
	}
	@Override
	public Researcher update (Researcher u) {
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
	public Researcher delete (Researcher u) {
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
