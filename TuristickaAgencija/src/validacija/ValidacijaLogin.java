package validacija;

import model.Rola;
import model.User;

public class ValidacijaLogin {

	public boolean daLiJeAdmin(User loginUser) {
		
		if(loginUser.getRola() == Rola.ADMIN) {
			return true;
		} else {
		   return false;
		}
	}

}
