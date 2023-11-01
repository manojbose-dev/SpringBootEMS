<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME TO EMS</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="/css/page1.css" rel="stylesheet"/>
</head>
<body>
<br>
<h1>UPDATE EMPLOYEE</h1>
<br>
<br>
<br>
<div id="upemp" align="center">
<form action="updatedEmp" method="post" name="frm">
<input type="text" name="name" value="${name}" class="form-control">
<input type="text" name="dept" value="${dept}" class="form-control">
<br>
<Button type="submit" class="btn btn-success">UPDATE</Button>
</form>

</div>
</body>
</html>