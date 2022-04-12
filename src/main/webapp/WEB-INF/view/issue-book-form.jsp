<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Add Book Form</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/bootstrap.min.css"/>
    </head>
    
    <body>
        <%@include   file="navlibrarian.html"%>
        <div class='container'>
            <h3>Issue Book Form</h3>
            <form:form action="IssueBook" modelAttribute="issueBook" method="post" style="width:300px">   
                <div class="form-group">
                  <label for="id1">Student Id</label>
                  <form:input path="studentId"  class="form-control" name="studentid" id="id1" placeholder="Student Id"/>
                </div>
                
                <div class="form-group">
                  <label for="name1">Student Name</label>
                  <form:input path="studentName"  class="form-control" name="studentname" id="name1" placeholder="Student Name"/>
                </div>
                
                <div class="form-group">
                  <label for="mobile1">Student Mobile</label>
                  <form:input path="studentMobile"  class="form-control" name="studentmobile" id="mobile1" placeholder="Student Mobile"/>
                </div>
                
                <div class="form-group">
                  <label for="issuedDate">Issued Date</label>
                  <form:input path="issuedDate"  class="form-control" name="issuedDate" id="issuedDate" placeholder="Issued Date"/>
                </div>
                
                <button type="submit" class="btn btn-primary">Issue Book</button>
            </form:form>
        </div>
        <%@include  file="footer.jsp"%>
    </body>
</html>
 