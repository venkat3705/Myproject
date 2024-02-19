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
<h2>Product details</h2>
<form action="InserPage2" method="post">
<table>
 <tr><td><h3>pro_id:</h3></td><td><input type="text" placeholder="id" name="pid"></td></tr><br>
 <tr><td><h3>pro_name :</h3></td><td> <input type = "text" placeholder="name" name="pname"></td></tr><br>
 <tr><td><h3>pro_price:</h3></td><td> <input type = "text" placeholder="price" name="pprice"></td></tr><br>
 <tr><td><h3>e_id:</h3></td><td><input type="text" placeholder="id" name="eid"></td></tr><br>
 
<tr><td><input type = "submit" value= "submit"></td><td><a href="ViewDetails"><h5>ViewDetails</h5></a></td></tr>


</div>
</body>
</html>