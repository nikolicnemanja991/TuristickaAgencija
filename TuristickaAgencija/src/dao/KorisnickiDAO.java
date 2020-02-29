package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Destinacija;
import model.User;

public class KorisnickiDAO {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public List<Destinacija> dajSveDestinacije() {
		
		List<Destinacija> destinacije = new ArrayList<Destinacija>();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		try {
			final String sql = "FROM Destinacija";
			Query query = session.createQuery(sql);
			destinacije = (List<Destinacija>)query.getResultList();
			
			session.getTransaction().commit();
			return destinacije;
		} catch (Exception e){
			session.getTransaction().rollback();
			return null;
		} 
	}

}
