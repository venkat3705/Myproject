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
<h1>create account</h1>

<form action="InsertPage" method="post">
<table>
 <tr><td><h3>e_id:</h3></td><td><input type="text" placeholder="id" name="eid"></td></tr><br>
 <tr><td><h3>e_name :</h3></td><td> <input type = "text" placeholder="name" name="ename"></td></tr><br>
 <tr><td><h3>e_pass:</h3></td><td> <input type = "password" placeholder="password" name="epass"></td></tr><br>
<tr><td><input type = "submit" value= "submit"></td></tr>

</table>
</form>
</div>
</body>
</html>