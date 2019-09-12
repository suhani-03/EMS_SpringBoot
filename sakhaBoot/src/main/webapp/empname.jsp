<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
form{
    background-color: burlywood;
    background-image: url(pro7.jpg);
    padding-left: 150px;
    padding-top: 150px;
    padding-bottom: 100px;
}
header{
	background-color: darkgray;
	background-image: url(pro7.jpg);
	padding-top: 40px;
	
	text-align: center;
	
}
body{
	background-color: darkgray;
}
</style>
<body>
<header>
<h1><b><i><u>Employee Management System</u></i></b></h1>
</header>

<form action="byname" method="get">
<label for="empName">
<b>Enter Employee Name: </b></label>
<input type="text" name="empName"><br><br><br>
<input type="submit" >
</form>
</body>
</html>