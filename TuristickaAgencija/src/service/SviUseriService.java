package service;

import java.util.List;

import dao.SviUseriDAO;
import model.User;

public class SviUseriService {
	
	SviUseriDAO dao = new SviUseriDAO();

	public List<User> vratiSveUsere() {
		
		return dao.vratiSveUsere();
	}

	public boolean dodajBalance(Integer idUser, Double addBalance) {
		System.out.println("user id: " + idUser);
		System.out.println("addBalance: " + addBalance);
		return dao.dodajBalance(idUser, addBalance);
	}



	

}
