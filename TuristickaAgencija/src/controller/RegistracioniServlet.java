package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.RegistracioniService;


@WebServlet(description = "ovo je servlet za registraciju korisnika", urlPatterns = { "/RegistracioniServlet" })
public class RegistracioniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistracioniServlet() {
        super();
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// preuzimanje parametara sa forme
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String repeatedPassword = request.getParameter("repeatedPassword");
		
		RegistracioniService service = new RegistracioniService();
		
		// proveravamo passworde
		boolean proveraPassworda = service.daLiSuIstiPasswordi(password, repeatedPassword);
		// vraca mi popunjenog usera - model
		User user = service.vratiUserModel(userName, password);
		
		if (proveraPassworda) {
			
			boolean daLiJeUpisaoUseraUbazu = service.upisiUseraUbazu(user);
			
			if(daLiJeUpisaoUseraUbazu) {
				response.sendRedirect("htmlFajlovi/uspesnaRegistracija.html");
			} else {
				response.sendRedirect("htmlFajlovi/registracija.html");
			}
		} else {
			// vrati se na registracionu formu
			response.sendRedirect("htmlFajlovi/registracija.html");
		}
	
	}

}
