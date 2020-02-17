package validacija;

public class ValidacijaRegistracije {
	
	public boolean daLiSuIstiPasswordi(String password, String repeatedPassword) {
		if(password.equals(repeatedPassword)) {
			return true;
		} else {
			return false;
		}
	}

}
