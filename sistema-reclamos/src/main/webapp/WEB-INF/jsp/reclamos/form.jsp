<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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

	<h1>Form reclamo</h1>

	<form:form action="/reclamos/guardar" method="post" modelAttribute="formReclamo">

	<table>
		<tr>
			<td><b>Id</b></td>
			<td><form:input path="id" readonly="true"/></td>
		</tr>

		<tr>
			<td><b>Titulo</b></td>
			<td><form:input path="titulo"/></td>
		</tr>
		<tr>
			<td><b>Descripcion</b></td>
			<td><form:textarea rows="5" cols="10" path="descripcion"/> </td>
		</tr>		
		<tr>
			<td><button class="btn btn-primary" type="submit">Guardar</button></td>
		</tr>
	</table>
	
	
	
	</form:form>
	<jsp:include page="../template_inferior.jsp"></jsp:include>
	
</body>
</html>