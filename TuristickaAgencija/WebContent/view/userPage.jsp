<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.User" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Userova strana</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>
<body>

	<div id="plavaCrta">
		LOGO
	</div>

	<%-- <% User user = (User)session.getAttribute("userIzBaze"); %> --%>
	<jsp:useBean id="user" scope="session" class="model.User"></jsp:useBean>

	<h1>Hello ${user.userName}</h1>
	<h2> BALANCE:  ${user.balance}</h2>
	
	<a href = "../BirajDestinacijuServlet"><button>Biraj Destinaciju</button></a>
	
</body>
</html>