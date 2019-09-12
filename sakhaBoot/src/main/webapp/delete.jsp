<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body{
    background-color: adetblue;
    background-image: url(pro7.jpeg);
    background-repeat: no-repeat;
}
form{
	padding-top: 150px;
	padding-left: 200px;
}
h1{
	text-align: center;
	padding-top: 20px;
}
header{
	border: 2px double;
	border-color: lightsteelblue;
	border-radius: 50%;
}
</style>
<body>
<header>
<h1><b><i><u>Employee Management System</u></i></b></h1>
</header>
<form action="delete" method="get">
<label><b>Id: </b></label>
<input type="number" name="empId"><br><br><br>
<input type="submit" value="Delete">
</form>
</body>
</html>