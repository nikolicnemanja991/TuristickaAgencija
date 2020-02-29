package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.User;

public class SviUseriDAO {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public List<User> vratiSveUsere() {
		
		List<User> listaUsera = new ArrayList<User>();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		try {
			String sql = "from User";
			
			Query query = session.createQuery(sql);
			listaUsera = query.getResultList();
			
			session.getTransaction().commit();
			return listaUsera;
			
		} catch (Exception e){
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}

	public boolean dodajBalance(User u, Double addBalance) {
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		try {
			
			User user = session.get(User.class, u.getIdUser());
			user.setBalance(user.getBalance()+addBalance);
			
			session.update(user);
			session.getTransaction().commit();
			return true;
			
		} catch (Exception e){
			session.getTransaction().rollback();
			return false;
		} 
	}
	
	

}
