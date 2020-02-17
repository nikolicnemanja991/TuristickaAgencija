<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.User" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Adminova strana</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>
<body>

	<div id="plavaCrta">
		LOGO
	</div>

	
	<% User user = (User)session.getAttribute("userIzBaze"); %>

	<h1>Hello <%=user.getUserName() %></h1>
	
	<% 
	int k = 2;
	int j = 1;
	int zbir = k+j;
	%>
	
	<% if (zbir<5){ %>
	<p> Nista! </p>
	<% } else { %>
	<p> Vece ili jednako od 5! </p>
	<% } %>
	
	
	
	<br><br>
	
	<% for(int i = 0; i<5; i++){ %>
	<p> Broj: <%= i %> </p>
	<% } %>
	
	<br><br>
	
	<table border="1">
		<tr>
			<th>BROJ</th>
			<th>NESTO</th>
		</tr>
		<% for(int i = 0; i<5; i++){ %>
		<tr>
			<td><%= i %></td>
			<td><%= 9-i %></td>
		</tr>
		<% } %>
	</table>
	
	
	<a href="../SviUseriServlet"><img alt="nema slike" src="../slike/globus.jpg"></a>
	
	<a href="dodajDestinaciju.jsp"><button>Dodaj destinaciju</button></a>
	<a href="../ListaDestinacijaServlet"><button>Dodaj transport</button></a>
	
	

</body>
</html>