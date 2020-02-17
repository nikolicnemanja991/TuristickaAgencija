<%@page import="model.Destinacija"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	
	<h1>Transport</h1>
	
	<% 
	List<Destinacija> lista = (List<Destinacija>)request.getAttribute("listaDestinacija");
// 	request.setAttribute("listaDestinacija2", lista);
// 	RequestDispatcher dispatcher = request.getRequestDispatcher("view/dodajTransport.jsp");
// 	dispatcher.forward(request, response);
	%>
	
	
	<form action="DodajTransportServlet" method="get">
		Izaveri destinaciju:
		<select name="destinacija">
			<% for (Destinacija d: lista){%>
				<option value="<%=d.getIdDestinacija()%>"><%= d.getDrzava() %> / <%= d.getMesto() %></option>
			<%} %>
		</select>
		
		<br><br>
		
		<input type="radio" name="radioDugme" value="sopstveni">
		<label for="male">sopstveni</label><br>
		<input type="radio" name="radioDugme" value="avio">
		<label for="male">avio</label><br>
		<input type="radio" name="radioDugme" value="autobus">
		<label for="male">autobus</label><br>
		<input type="radio" name="radioDugme" value="voz">
		<label for="male">voz</label><br>
		
		<br><br>
		
		Cena:<input type="text" name="cena"><br><br>
		Popust:<input type="text" name="popust"><br><br>
		<input type="submit" value="UPISI">
	
	</form>
	

</body>
</html>