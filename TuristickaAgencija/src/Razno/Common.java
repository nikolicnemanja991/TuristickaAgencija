package Razno;

import model.Admin;
import model.Rola;
import model.TipTransporta;
import model.Transport;
import model.User;

public class Common {

	public User vratiUserModel(String userName, String password) {
		
		Admin admin = new Admin();
		
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		
		if (userName.equals(admin.getAdminUserName())  && password.equals(admin.getAdminPassword())) {
			user.setRola(Rola.ADMIN);
		}else {
			user.setRola(Rola.KORISNIK);
		}
		
		return user;
	}

	public void podesiTipTransporta(String tipPrevoza, Transport transport) {
		
		if(tipPrevoza.equals("avio")) {
			transport.setTipTransporta(TipTransporta.AVION);
		}else if(tipPrevoza.equals("autobus")) {
			transport.setTipTransporta(TipTransporta.AUTOBUS);
		}else if(tipPrevoza.equals("voz")) {
			transport.setTipTransporta(TipTransporta.VOZ);
		}else if(tipPrevoza.equals("sopstveni")) {
			transport.setTipTransporta(TipTransporta.SOPSTVENI);
		}
	}

}
