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

	<nav class="navbar navbar-expand-lg bg-body-tertiary">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">Reclamos</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarNavDropdown">
	      <ul class="navbar-nav">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Listado</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Crear reclamo</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>

	<div class="container">

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
	</div>
</body>
</html>