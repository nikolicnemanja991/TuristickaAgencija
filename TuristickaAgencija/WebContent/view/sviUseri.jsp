<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
 <%@ page import="java.util.ArrayList" %>
 <%@ page import="model.User" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>All Users</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>
<body>

	<div id="plavaCrta">LOGO</div>
	
	<a href="adminPage.jsp">nazad na admin page</a>
	<% 
		List<User> useri = new ArrayList<User>();
		useri = (List<User>)session.getAttribute("useriIzBaze");
	%>
	
	<jsp:useBean id="useriIzBaze" scope="session" class="java.util.ArrayList"></jsp:useBean>
	<c:set var="useri" value="${useriIzBaze}"/>

	
	<h1>Tabela svih usera.</h1>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>USER NAME</th>
			<th>PASSWORD</th>
			<th>BALANS</th>
			<th>ROLA</th>
			<th>ADD BALANCE</th>
		</tr>
		<c:forEach var="u" items="${useri}">
		<tr>
			<td>${u.idUser}</td>
			<td>${u.userName}</td>
			<td>${u.password}</td>
			<td>${u.balance}</td>
			<td>${u.rola}</td>
			<td>

				<a href="<c:url value="didajBalance.jsp">
					<c:param name="index" value="${u.idUser}"></c:param>
				</c:url>">dodaj</a>
				
<%-- 				<c:url var="link" value="didajBalance.jsp">
					<c:param name="index" value="${u.idUser}"></c:param>
				</c:url>
				<a href="${link}"></a> --%>
				
				
			</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>