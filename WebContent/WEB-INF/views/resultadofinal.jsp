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

	<div class="w3-container w3-section w3-green">
		<span onclick="this.parentElement.style.display='none'"
			class="w3-closebtn">&times;</span>
		<h3>Successo!</h3>
		<p>A conversao do numero romano para o numero natural foi efetuada
			com sucesso.</p>
	</div>

	<table class="w3-table w3-striped w3-large">
		<tr>
			<th>Numero Romano</th>
			<th>Numero Natural</th>

		</tr>
		<tr>
			<td>${numeroRomano.numeroRomano}</td>
			<td>{numero}</td>

		</tr>

	</table>

	<c:import url="rodape.jsp" />

</body>
</html>