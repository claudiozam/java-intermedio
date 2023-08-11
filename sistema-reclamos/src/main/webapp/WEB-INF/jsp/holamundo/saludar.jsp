<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Hola a todos me llamo ${nombre}</h1>
	<table>
		<tr>
			<td><strong>Id</strong></td>
			<td>${estadoReclamo.id}</td>
		</tr>
		<tr>
			<td><strong>Nombre</strong></td>
			<td>${estadoReclamo.nombre}</td>
		</tr>
	</table>
	<h2>Listado de estados....</h2>
	<table>
		<c:forEach items="${estadosReclamo}" var="estado">
			<tr><td>${estado.id}</td><td>${estado.nombre}</td></tr>
		</c:forEach>
	</table>
	
</body>
</html>