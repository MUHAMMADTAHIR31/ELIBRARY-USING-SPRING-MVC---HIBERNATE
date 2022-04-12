<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>View Book</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/bootstrap.min.css"/>
    </head>
    <body>
        <%@include  file="navlibrarian.html"%>
        <div id="container">
   
           
           <table class='table table-bordered table-striped'>
                <tr>
                    <th>Cell NO</th>
                    <th>Name</th>
                    <th>Author</th>
                    <th>publisher</th>
                    <th>issued</th>
                    <th>quantity</th>
                    <th>Action</th>
                </tr>
                
                <!--loop over and print our customer-->
                <c:forEach var="tempBooks" items="${books}">
                           <!--Update URL -->
                    <c:url var="updateLink" value="/books/showFormForUpdate">
                        <c:param name="cellId" value="${tempBooks.cellNo}"/>    
                    </c:url>  
                    
                      <!--Delete URL -->
                    <c:url var="deleteLink" value="/books/delete">
                        <c:param name="cellId" value="${tempBooks.cellNo}"/>    
                    </c:url>   
                        
                    <tr>
                        <td>${tempBooks.cellNo}</td>
                        <td>${tempBooks.name}</td>
                        <td>${tempBooks.author}</td>
                         <td>${tempBooks.publisher}</td>
                         <td>${tempBooks.issued}</td>
                        <td>${tempBooks.quantity}</td>
                         <td>
                            <a href="${updateLink}">Update</a>
                            ||
                            <a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete this librarian')))return false">Delete</a>
                        </td>   
                    </tr>
                </c:forEach>   
            </table>
            
            <br/><br/>
            
    </div>   
</body>
</html>