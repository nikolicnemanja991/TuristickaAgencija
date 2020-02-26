<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Dodaj balans</h1>
	<%-- Index: ${param.index} --%>

	<c:set var="idUser" value="${param.index}"></c:set>
	
	
	idUser: ${idUser}
	
	<form action="../DodajBalanceServlet" method="get">
		<input type="hidden" name="id" value="${idUser}"/>
		Upisi iznos: <input type="text" name="add"/>
		<input type="submit" value="DODAJ"/>
	</form>
	

</body>
</html>