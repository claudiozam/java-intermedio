<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>Listado de reclamos....</h1>


	<table>
		<tr>
			<th>Id</th>
			<th>Titulo</th>
			<th>Fecha alta</th>
			<th>Estado</th>
			<th></th>
		</tr>
		<c:forEach items="${reclamos}" var="reclamo">
		<tr>
			<td>${reclamo.id}</td>
			<td>${reclamo.titulo}</td>
			<td>${reclamo.fechaDeAlta}</td>
			<td>${reclamo.estadoReclamo.nombre}</td>
			<td>
				<a href="/reclamos/ver/${reclamo.id}">Ver</a>
				&nbsp;
				<a href="/reclamos/borrar/${reclamo.id}">Borrar</a>
			</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>