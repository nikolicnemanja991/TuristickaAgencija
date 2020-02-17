<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Userova strana</title>
</head>
<body>

	<% User user = (User)session.getAttribute("userIzBaze"); %>

	<h1>Hello <%=user.getUserName() %></h1>

</body>
</html>