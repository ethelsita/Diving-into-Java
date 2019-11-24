<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h1>***EMPRESA BONITA***</h1>
	<p>
	<sec:authorize access="!isAuthenticated()">
			
		
		
	    <p> Empresa que te ayuda a verte y sentirte bien. La felicidad está en ti, solo la tienes que econtrar.</p>
	    
	    <a href="${pageContext.request.contextPath}/formlogin/"
				class="btn btn-outline-primary">Loguearse</a>	
	</sec:authorize>
	
	
	<sec:authorize access="isAuthenticated()">
		Usuario:
	  	<sec:authentication property="principal.username" />
	  	Roles:
	 	 <sec:authentication property="principal.authorities" />
	 
	</sec:authorize>
		
		
	</p>
	<br>
	<sec:authorize access="hasRole('ADMIN')">
		<a href="${pageContext.request.contextPath}/admin/"
			class="btn btn-outline-primary">Área Administración</a>
	</sec:authorize>

		<sec:authorize access="hasRole('EDITOR')">
		<a href="${pageContext.request.contextPath}/editor/"
			class="btn btn-outline-primary">Área Editores</a>
	</sec:authorize>
	
			<sec:authorize access="hasRole('COLAB')">
		<a href="${pageContext.request.contextPath}/colab/"
			class="btn btn-outline-primary">Área Colaboradores</a>
	</sec:authorize>
	<br>
	<br><br>
		<sec:authorize access="isAuthenticated()">
		
	  
	 	 <form:form action="${pageContext.request.contextPath}/logout"
			method="POST">
			<button type="submit" class="btn btn-warning">Salir</button>
		</form:form>
	</sec:authorize>
	
</div>
</body>
</html>