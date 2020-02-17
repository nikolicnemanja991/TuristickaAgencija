package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.User;

public class LoginDAO {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public User vratiUseraLogin(String userName, String password) {
		User user = new User();
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		
		try {
			Query query = sesija.createQuery("from User where userName = :x AND password = :y");
			query.setParameter("x", userName);
			query.setParameter("y", password);
			
			List<User> useri = query.getResultList();
			
			if(useri.isEmpty()) {
				sesija.getTransaction().commit();
				return null;
			} else if (useri.size() == 1) {
				return useri.get(0);
			} else {
				return null;
			}
			
		} catch (Exception e){
			sesija.getTransaction().rollback();
			return null;
		} finally {
			sesija.close();
		}
	}

}
