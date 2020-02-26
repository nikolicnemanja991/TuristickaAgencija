package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destinacija;
import model.TipTransporta;
import model.Transport;
import service.TransportService;


@WebServlet("/DodajTransportServlet")
public class DodajTransportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cena = request.getParameter("cena");
		String popust = request.getParameter("popust");
		String tipPrevoza = request.getParameter("radioDugme");
		String idDestinacija = request.getParameter("destinacija");
		
		TransportService service = new TransportService();
		
		// model za bazu
		Transport transport = new Transport();
		
		if(cena != null) {
			transport.setCena(Double.parseDouble(cena));
		}
		if(!(popust.trim()).isEmpty()) {
			transport.setPopust(Double.parseDouble(popust));
		}else {
			transport.setPopust(0.0);
		}
		
		if(tipPrevoza != null) {
			service.podesiTipTransporta(tipPrevoza, transport);
		}
		
		Destinacija destinacija = service.vratiDestinacijuPoId(idDestinacija);
		
		transport.setDestinacija(destinacija);
		
		boolean daLiJeUbacioTransport = service.snimiTransport(transport);
		
		if(daLiJeUbacioTransport) {
			response.sendRedirect("view/adminPage.jsp");
		}else {
			response.sendRedirect("view/dodajTransport.jsp");
		}
		
//		List<Destinacija> lista = (List<Destinacija>)request.getAttribute("listaDestinacija");
//		System.out.println("Id prve destinacije" + lista.get(0).getIdDestinacija());
		
	}

}
