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
                    <th>Student ID</th>
                    <th>Student Name</th>
                    <th>Student Mobile</th>
                    <th>Issued Date</th>
                    <th>Return Status</th>
                    <th>Action</th>
                </tr>
                
                <!--loop over and print our customer-->
                <c:forEach var="tempIssudeBook" items="${IssudeBook}">
                           <!--Update URL -->
                    <c:url var="updateLink" value="/books/showFormForUpdate">
                        <c:param name="studentId" value="${tempIssudeBook.studentId}"/>    
                    </c:url>  
                    
                    <tr>
                        <td>${tempIssudeBook.studentId}</td>
                        <td>${tempIssudeBook.studentName}</td>
                         <td>${tempIssudeBook.studentMobile}</td>
                         <td>${tempIssudeBook.issuedDate}</td>
                        <td>${tempIssudeBook.returnStatus}</td>
                        
                        <td>
                            <a href="${updateLink}">Update</a>
                        </td>   
                    </tr>
                </c:forEach>   
            </table>
            
            <br/><br/>
            
    </div>   
</body>
</html>