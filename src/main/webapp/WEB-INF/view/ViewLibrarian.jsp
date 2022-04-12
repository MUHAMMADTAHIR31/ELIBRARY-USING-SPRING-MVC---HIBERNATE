<%-- 
    Document   : ViewLibrarian
    Created on : Mar 17, 2022, 12:36:52 PM
    Author     : Dell
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Librarian</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/bootstrap.min.css">
    </head>
    
    <body>
        <%@include file="navadmin.html" %>
            <div class='container'>
            <table class='table table-bordered table-striped'>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Mobile</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
               
                 <!--loop over and print our customer-->
                <c:forEach var="tempLibrarian" items="${Librarian}">
                    
                      <!--Update URL -->
                    <c:url var="updateLink" value="/librarian/showFormForUpdate">
                        <c:param name="librarianId" value="${tempLibrarian.libraryId}"/>    
                    </c:url>  
                    
                      <!--Delete URL -->
                    <c:url var="deleteLink" value="/librarian/delete">
                        <c:param name="librarianId" value="${tempLibrarian.libraryId}"/>    
                    </c:url>   
                      
                      
                    <tr>
                        <td>${tempLibrarian.libraryId}</td>
                        <td>${tempLibrarian.name}</td>
                        <td>${tempLibrarian.email}</td>
                        <td>${tempLibrarian.password}</td>
                        <td>${tempLibrarian.mobile}</td>
                         
                        <td>
                            <a href="${updateLink}">Update</a>
                        </td>    
                        
                        <td>
                            <a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete this librarian')))return false">Delete</a>
                        </td>   
                    </tr>
                </c:forEach>   
            </table>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
