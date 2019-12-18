<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Bootstrap4 Landing Page</title>
  
    <!-- BOOTSTRAP CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
  
    <!-- FONT AWESOME -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css"  integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
    <link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>
   
    <!-- CUSTOM CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/archivos/css/main.css">
    
  </head>
  <body>
    <!-- NAVIGATION -->
    
 
 <nav class="navbar navbar-expand-lg navbar-light bg-white">
      <div class="container">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">
          <img src="${pageContext.request.contextPath}/archivos/img/logo.png" style="width: 30%;">
        </a>
       
        	<sec:authorize access="hasRole('ADMIN')">
	
				<a href="${pageContext.request.contextPath}/admin/addblogentry" class="btn btn-primary mb-1">Añadir entrada</a>
		    </sec:authorize>
      
        <form:form class="form-inline justify-content-center"
			action="${pageContext.request.contextPath}/filtro"
			method="POST">
 				<div class="my-3">Encuentra todo lo que quieras:  </div>
			 <div class="form-group mx-sm-3 mb-2">
            <label for="palabra" class="sr-only">Palabra</label>
            <input name="palabra" type="search" class="form-control" id="palabra" placeholder="Palabra">
            	
          </div>
			<button type="submit" class="btn btn-primary">IR</button>
		</form:form>
			

        <button class="navbar-toggler  " type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>

        </button>
        
        
        <div class="collapse navbar-collapse " id="navbarNav">
          <ul class="navbar-nav ml-auto">

            <li class="nav-item">
				<sec:authorize access="!hasAnyRole('USER','ADMIN')">
                      <a class="nav-link" href="${pageContext.request.contextPath}/login">Iniciar</a>
              	</sec:authorize>
        	
              	<sec:authorize access="hasAnyRole('USER','ADMIN')">
              	   <sec:authentication property="principal.username" />
					 <form:form action="${pageContext.request.contextPath}/logout" method="POST">
					 <button type="submit" class="btn btn-warning">Salir</button>
				     </form:form>
				</sec:authorize>
				
              
            </li>
          </ul>
        </div>
        

      </div>
    </nav>

<br><br>


    <!-- TEAM -->
    
    

  
  
    <div id="top" class="starter_container bg" style="background-image: url('${pageContext.request.contextPath}/archivos/img/${blogentry.filename }');">
            <div class="follow_container">
                <div class="col-md-6 col-md-offset-3">
                    <h2 class="top-title">${blogentry.title }</h2>
                    <h2 class="white second-title"></h2>
                    <hr>
                </div>
            </div>
        </div>
        <!-- gggggg -->

        <section id="story" class="description_content">
            <div class="text-content container">
                <div class="col-md-12">
               
                    <p class="desc-text">${blogentry.description }</p>
                </div>
               
               
               <!-- <div class="col-md-6">
                    <div class="img-section">
                       <img src="${pageContext.request.contextPath}/archivos/img/aribalo.jpg" width="250" height="220">
                       <img src="${pageContext.request.contextPath}/archivos/img/aribalo.jpg" width="250" height="220">
                       <div class="img-section-space"></div>
                       <img src="${pageContext.request.contextPath}/archivos/img/aribalo.jpg"  width="250" height="220">
                       <img src="${pageContext.request.contextPath}/archivos/img/aribalo.jpg"  width="250" height="220">
                   </div>
                </div>-->
            </div>
        </section>
  



    <br>



    <footer>
      <div class="container p-3">
        <div class="row text-center text-white">
          <div class="col ml-auto">
            <p>Copyright &copy; 2018</p>
          </div>
        </div>
      </div>
    </footer>

    <!-- BOOTSTRAP SCRIPTS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
  </body>
</html>
