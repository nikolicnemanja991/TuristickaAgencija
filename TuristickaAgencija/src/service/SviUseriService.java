package service;

import java.util.List;

import dao.SviUseriDAO;
import model.User;

public class SviUseriService {
	
	SviUseriDAO dao = new SviUseriDAO();

	public List<User> vratiSveUsere() {
		
		return dao.vratiSveUsere();
	}

	public boolean dodajBalance(User user, Double addBalance) {
		
		return dao.dodajBalance(user, addBalance);
	}



	

}
