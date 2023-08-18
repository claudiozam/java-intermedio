<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="../../js/bootstrap.js"></script>
	<link href="../../css/bootstrap.css" rel="stylesheet" />
</head>
<body>
	
	<jsp:include page="../template_superior.jsp"></jsp:include>

	<h1>Ver reclamo</h1>
	<table>
		<tr>
			<td><b>Id</b></td>
			<td>${reclamo.id}</td>
		</tr>
		<tr>
			<td><b>Titulo</b></td>
			<td>${reclamo.titulo}</td>
		</tr>
		<tr>
			<td><b>Descripcion</b></td>
			<td>${reclamo.descripcion}</td>
		</tr>		
	</table>
	
	<jsp:include page="../template_inferior.jsp"></jsp:include>
	
</body>
</html>