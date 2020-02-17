package service;

import dao.LoginDAO;
import model.User;
import validacija.ValidacijaLogin;

public class LoginService {
	
	LoginDAO dao = new LoginDAO();
	
	ValidacijaLogin validacija = new ValidacijaLogin();

	public User vratiUseraLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.vratiUseraLogin(userName, password);
	}

	public boolean daLiJeAdmin(User loginUser) {
		// TODO Auto-generated method stub
		return validacija.daLiJeAdmin(loginUser);
	}

}
