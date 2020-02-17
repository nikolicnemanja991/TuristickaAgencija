package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import service.SviUseriService;

@WebServlet("/SviUseriServlet")
public class SviUseriServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SviUseriService service = new SviUseriService();
		
		List<User> useriIzBaze = service.vratiSveUsere();
		
		if(useriIzBaze != null) {
			// 1. request object
			// 2. session object
			HttpSession session = request.getSession();
			session.setAttribute("useriIzBaze", useriIzBaze);
			response.sendRedirect("view/sviUseri.jsp");
		} else {
			response.sendRedirect("view/adminPage.jsp");
		}
	}

}
