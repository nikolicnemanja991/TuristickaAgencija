package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destinacija;
import service.KorisnickiService;


@WebServlet("/BirajDestinacijuServlet")
public class BirajDestinacijuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		KorisnickiService servis = new KorisnickiService();
		List<Destinacija> destinacije = servis.dajSveDestinacije();
		
		if(destinacije != null) {
			request.setAttribute("destinacije", destinacije);
			RequestDispatcher dispacher = request.getRequestDispatcher("view/birajDestinaciju.jsp");
			dispacher.forward(request, response);
		}else {
			response.sendRedirect("view/userPage.jsp");
		}
	}

}
