
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="/css/page1.css" rel="stylesheet"/>
</head>
<body>
<br>
<h1>ALL STAFF OF EMS</h1>
<br>
<br>
<br>
<div id="display">
<table border="1" width="50%" align="center">
<tr><th>NAME</th><th>DEPARTMENT</th></tr>
<c:forEach items="${employee}" var="emp">
<tr><td>${emp.name}</td><td>${emp.dept}</td><td><a href="upEmp?name=${emp.name}&dept=${emp.dept}">Update</a></td><td><a href="deleteEmp?name=${emp.name}">Delete</a></td></tr>
</c:forEach>
</table>
<h3>${mess}</h3>
</div>

</body>
</html>