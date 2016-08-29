<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Projeto PM83- Numeros Romanos</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />

	<div class="w3-container">
		<h2>.:Conversao de Numeros Romanos para Numeros Naturais.:</h2>
	</div>

	<form class="w3-container" action="">

		<p>
			<label class="w3-label w3-text-black">
				Introduza o numero romano que pretende converter:
			</label> 
			<input class="w3-input" type="text" name="numeroRomano">
			
		</p>
		
		<input class="w3-input" type="submit" value="Converter">

	</form>
	
	
	<c:import url="rodape.jsp" />
	
</body>
</html>