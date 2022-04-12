<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/bootstrap.min.css">
    
    <%@ include file="navadmin.html" %>
    <h3>Add Librarian</h3>    
    <form:form action="saveLibrarian" modelAttribute="Librarian" method="post" style="width:300px">
        <div class="form-group">
            <label for="name1">Name</label>
            <form:input path="name" class="form-control" name="name" id="name1" placeholder="Name"/>
        </div>
  
        <div class="form-group">
            <label for="email1">Email address</label>
            <form:input path="email" class="form-control" name="email" id="email1" placeholder="Email"/>
        </div>
  
        <div class="form-group">
            <label for="password1">Password</label>
            <form:password path="password" class="form-control" name="password" id="password1" placeholder="Password"/>
        </div>  
        
        <div class="form-group">
            <label for="mobile1">Mobile Number</label>
            <form:input path="mobile" class="form-control" name="mobile" id="mobile1" placeholder="Mobile"/>
        </div>
        
        <button type="submit" class="btn btn-primary">Submit</button>
</form:form>