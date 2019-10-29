<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta alumnos</title>
<style>
.error {
color: red;
}
</style>


</head>

<body>
	<form:form action="procesar" modelAttribute="alumno">
		Nombre:<form:input path="nombre"/><br/><form:errors path="nombre" cssClass="error" /><br />
		DNI:<form:input path="dni" /><form:errors path="dni" cssClass="error" /><br />		
		email:<form:input path="email" /><form:errors path="email" cssClass="error" /><br />
		Becado: <form:radiobuttons path="becado" items="${alumno.listaBecados}" /><br/>
		Asignaturas: <form:checkboxes path="asignaturas" items="${alumno.listaAsignaturas}" /><br />
	
		<input type="submit">
	</form:form>

</body>
</html>