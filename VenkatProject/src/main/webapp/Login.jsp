<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align ="center">
<h1>Login account</h1>

<form action="ValidatePage" method="get">
<table>
 <tr><td><h3>UserName:</h3></td><td><input type="text" placeholder="empid" name="eid"></td></tr><br>
 <tr><td><h3>Password :</h3></td><td> <input type = "password" placeholder="password" name="epass"></td></tr><br>
 <tr><td><input type = "submit" value= "submit"></td><td><a href=" register.jsp"><h5>Register</h5></a></td></tr>
 <tr><td><a href="update.jsp"><h5>Forget Password</a></td></tr>

</table>
</form>
</div>
</body>
</html>