<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/bootstrap.min.css">
    
    <%@ include file="navadmin.html" %>
    
    <h3>Return Book Form</h3>
    
    <form:form action="ReturnBook" modelAttribute="issuedBook" method="post" style="width:300px">
        
        <div class="form-group">
          <label for="callno1">Cell No</label>
          <form:input path="cellNo" class="form-control" name="callno" id="callno1" placeholder="Callno"/>
        </div>
        
        <div class="form-group">
          <label for="studentid1">Student Id</label>
          <form:input path="studentId" class="form-control" name="studentid" id="studentid1" placeholder="StudentId"/>
        </div>
        
        <button type="submit" class="btn btn-primary">Return Book</button>
    </form:form>
    
    <%@include  file="footer.jsp" %>