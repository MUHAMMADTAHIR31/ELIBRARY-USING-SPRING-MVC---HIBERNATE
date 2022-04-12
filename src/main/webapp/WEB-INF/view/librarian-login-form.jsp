<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Librarian Section</title>     
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/bootstrap.min.css"/>
    </head>
    
    <body>
        <div class='container'>    
            <h3>Username or password error</h3>
            <br/>
        
            <h3>Librarian Login</h3>
            <form:form action="librarianLogin" modelAttribute="library" method="post" style="width:300px">
            
                <div class="form-group">
                    <label for="email1">Email address</label>
                    <form:input path="email" class="form-control"  name="email" id="email1" placeholder="Email"/>
                </div>
            
                <div class="form-group">
                    <label for="password1">Password</label>
                    <form:password path="password" class="form-control" name="password" id="password1" placeholder="Password"/>
                </div>  
                
                <button type="submit" class="btn btn-primary">Login</button>
            </form:form>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>     
               