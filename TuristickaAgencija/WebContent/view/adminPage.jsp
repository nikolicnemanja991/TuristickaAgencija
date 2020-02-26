<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
	
	<c:set var="x" value="6"></c:set>
	<c:set var="y" value="7"></c:set>
	<c:set var="zbir" value="${x+y}"></c:set>
	
	<br><br>
	
	<table border="1">
		<tr>
			<th>BROJ</th>
			<th>NESTO</th>
		</tr>
		<c:forEach var="i" begin="0" end="5">
		<tr>
			<td>${zbir}</td>
			<td>${zbir-i}</td>
		</tr>
		</c:forEach>
	</table>
	
	<a href="../SviUseriServlet"><img alt="nema slike" src="../slike/globus.jpg"></a>
	
	<a href="dodajDestinaciju.jsp"><button>Dodaj destinaciju</button></a>
	<a href="../ListaDestinacijaServlet"><button>Dodaj transport</button></a>

</body>
</html>