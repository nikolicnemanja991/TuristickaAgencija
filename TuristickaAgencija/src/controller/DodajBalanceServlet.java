package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.SviUseriService;


@WebServlet("/DodajBalanceServlet")
public class DodajBalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String add = request.getParameter("add");
		
		Integer idUser = Integer.parseInt(id);
		Double addBalance = Double.parseDouble(add);
		
		SviUseriService servis = new SviUseriService();
		
		User user = new User();
		List<User> useri = servis.vratiSveUsere();
		
		for(User u: useri) {
			if(u.getIdUser()==idUser) {
				user = u;
			}
		}
		
		
		boolean daLiSiDodaoBAlence = servis.dodajBalance(user, addBalance);
		
		if(daLiSiDodaoBAlence) {
			response.sendRedirect("view/sviUseri.jsp");
		}else {
			response.sendRedirect("view/dodajBalance.jsp");
		}
	}


}
