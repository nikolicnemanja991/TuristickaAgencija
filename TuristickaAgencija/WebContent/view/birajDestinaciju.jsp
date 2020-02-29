<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Destinacija" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>
<body>

	<div id="plavaCrta">
		LOGO
	</div>
	
	<jsp:useBean id="destinacije" scope="request" class="java.util.ArrayList"></jsp:useBean>
	
	<table border="1">
		<tr>
				<th>DRZAVA</th>
				<th>MESTO</th>
				<th>SMESTAJ</th>
				<th>POPUST</th>
				<th>CENA</th>
		</tr>
		<c:forEach var="d" items="destinacije">
		<tr>${d.drzava}</tr>
		<tr>${d.mesto}</tr>
		<tr>${d.smestaj}</tr>
		<tr>${d.popust}</tr>
		<tr>${d.cenaSmestaja}</tr>
		</c:forEach>
	</table>
	
		

</body>
</html>