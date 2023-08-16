<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="../js/bootstrap.js"></script>
	<link href="../css/bootstrap.css" rel="stylesheet" />
	
</head>
<body>


	<h1>Listado de reclamos....</h1>


	<table class="table table-bordered">
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
				<a class="btn btn-primary" href="/reclamos/ver/${reclamo.id}">Ver</a>
				&nbsp;
				<a class="btn btn-danger" href="/reclamos/borrar/${reclamo.id}">Borrar</a>
			</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>