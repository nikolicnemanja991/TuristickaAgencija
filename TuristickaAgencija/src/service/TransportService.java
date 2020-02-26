package service;

import java.util.List;

import Razno.Common;
import dao.TransportDAO;
import model.Destinacija;
import model.Transport;

public class TransportService {
	
	TransportDAO dao = new TransportDAO();
	Common zajednicka = new Common();

	public List<Destinacija> vratiSveDestinacije() {
		
		return dao.vratiSveDestinacije();
	}

	public void podesiTipTransporta(String tipPrevoza, Transport transport) {
		zajednicka.podesiTipTransporta(tipPrevoza, transport);
		
	}

	public Destinacija vratiDestinacijuPoId(String idDestinacija) {
		// TODO Auto-generated method stub
		return dao.vratiDestinacijuPoId(idDestinacija);
	}

	public boolean snimiTransport(Transport transport) {
		// TODO Auto-generated method stub
		return dao.snimiTransport(transport);
	}

}
