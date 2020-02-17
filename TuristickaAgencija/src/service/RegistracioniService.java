package service;

import Razno.Common;
import dao.RegistracijaDAO;
import model.User;
import validacija.ValidacijaRegistracije;

public class RegistracioniService {
	
	ValidacijaRegistracije validacija = new ValidacijaRegistracije();
	
	RegistracijaDAO dao = new RegistracijaDAO();
	
	Common razno = new Common();
	
	public boolean daLiSuIstiPasswordi(String password, String repeatedPassword) {
		return validacija.daLiSuIstiPasswordi(password, repeatedPassword);
	}

	public boolean upisiUseraUbazu(User user) {
		// TODO Auto-generated method stub
		return dao.upisiUseraUbazu(user);
	}

	public User vratiUserModel(String userName, String password) {
		
		return razno.vratiUserModel(userName, password);
	}

}
