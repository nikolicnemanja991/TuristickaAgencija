package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Destinacija;

public class DodajDestinacijuDAO {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public boolean dodajDestinaciju(Destinacija destinacija) {
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		
		try {
			sesija.save(destinacija);
			sesija.getTransaction().commit();
		} catch (Exception e){
			sesija.getTransaction().rollback();
			return false;
		} finally {
			sesija.close();
		}
		
		return true;
	}

}
