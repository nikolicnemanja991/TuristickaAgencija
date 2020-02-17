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
	
	<h1>DESTINACIJE</h1>
	
	<form action="../DodajDestinacijuServlet" method="get">
		Drzava: <input type="text" name="drzava"><br><br>
		Mesto: <input type="text" name="mesto"><br><br>
		Smestaj: <input type="text" name="smestaj"><br><br>
		Cena: <input type="text" name="cena"><br><br>
		Popust: <input type="text" name="popust"><br><br>
		
		<input type="submit" value="Dodaj destinaciju">
	</form>
	
	

</body>
</html>