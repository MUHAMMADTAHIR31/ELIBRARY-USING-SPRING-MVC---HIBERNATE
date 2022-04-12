<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="ISO-8859-1">
        <title>Welcome to E-library</title>
         <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/bootstrap.min.css"/>
    </head>
    
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container">
              <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                      <span class="sr-only">Toggle navigation</span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index">eLibrary</a>
                </div>

              <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                      <li><a href="index" class="active">Home</a></li>
                      <li><a href="#">Admin</a></li>
                      <li><a href="#">Librarian</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <div class="container-fluid">
            <h1>eLibrary</h1>
            <div class="row">
                <div class="col-md-6">
                    <h3>Admin Login</h3>
                    <!--modelAttribute="adminLogin"-->
                    <form:form action="adminLogin" modelAttribute="library"  method="POST" style="width:300px">
                                                
                        <div class="form-group">
                            <label>Email address</label>
                            <form:input path="email" class="form-control" id="email1" name="email" placeholder="email"/>
                        </div>

                        <div class="form-group">
                            <label for="password1">Password</label>
                            <form:password path="password" class="form-control" name="password" id="password1" placeholder="Password"/>
                        </div>
                        
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form:form>
              </div>

                <div class="col-md-6">
                    <h3>Librarian Login</h3>
                    
                    <form:form action="librarianLogin" modelAttribute="library" method="POST" style="width:300px">
                    
                        <div class="form-group">
                            <label for="email1">Email address</label>
                            <form:input path="email" class="form-control" id="email1" name="email" placeholder="Email"/>
                        </div>
                        
                        <div class="form-group">
                            <label for="password1">Password</label>
                            <form:password path="password" class="form-control" id="password1" name="password" placeholder="Password"/>
                        </div>
                        
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form:form>
                </div>
            </div>
        </div>
    
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assests/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assests/bootstrap.min.js"></script>
    </body>
</html>