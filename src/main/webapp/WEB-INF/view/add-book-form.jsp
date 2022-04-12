<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Add Book Form</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/bootstrap.min.css">
    </head>
    <body>
        <%@include  file="navlibrarian.html"%>
       
            <div class='container'>
                 <h3>Add Book Form</h3>
                <form:form action="addBook" method="post" modelAttribute="books" style="width:300px">

                <div class="form-group">
                    <label for="callno1">Cell No</label>
                    <form:input path="cellNo" class="form-control" name="cellno" id="cellno1" placeholder="Cellno"/>
                </div>

                <div class="form-group">
                    <label for="name1">Name</label>
                    <form:input path="name" class="form-control" name="name" id="name1" placeholder="Name"/>
                </div>

                <div class="form-group">
                    <label for="author1">Author</label>
                    <form:input path="author" class="form-control" name="author" id="author1" placeholder="Author"/>
                </div>

                <div class="form-group">
                    <label for="publisher1">Publisher</label>
                    <form:input path="publisher" class="form-control" name="publisher" id="publisher1" placeholder="Publisher"/>
                </div>
                
                <div class="form-group">
                    <label for="Issued">Issued</label>
                    <form:input path="issued" class="form-control" name="issued" id="issued" placeholder="issued"/>
                </div>
                
                <div class="form-group">
                    <label for="quantity1">Quantity</label>
                    <form:input path="quantity" class="form-control" name="quantity" id="quantity1" placeholder="Quantity"/>
                </div>
                <button type="submit" class="btn btn-primary">Save Book</button>
            </form:form>
        </div>
        <%@include  file="footer.jsp"%>
    </body>
</html>  