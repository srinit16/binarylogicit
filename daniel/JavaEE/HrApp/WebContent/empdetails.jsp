<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.pojos.Employee" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp Details</title>
</head>
<body>
<h2> This is JSP Page </h2>
<c:if test="${not empty emp}">
	<form action="HrController">
		ID: <input type="text" name="id" value="${emp.id}">  <BR>
		NAME:  <input type="text" name="name" value="${emp.name}">  <BR>
		SALARY: <input type="text" name="salary" value="${emp.salary}"> <BR>
		DEPTID: <input type="text" name="deptId" value="${emp.deptId}">  <BR>
		
		<input type="submit" value="Find"/><input type="submit" value="Insert"/>
	</form>
</c:if>

<c:if test="${empty emp}">
	<font color="red"> Employee Doesnt Exist : Pls check ID</font>
</c:if>

</html>