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
    background-color: burlywood;
    background-image: url(pro6.png);
}
form{
	padding-top: 175px;
	padding-left: 200px;
	color: white;
}
h1{
	color: white;
	text-align: center;
	
}
header{
	padding-top: 25px;
}
</style>
<body>
<header>
<h1><b><i><u>Employee Management System</u></i></b></h1>
</header>
<form action="update" method="post">
<label for="empId"><b>Employee Id: </b></label>
<input type="number" name="empId"><br><br>
<label for="salary"><b>Salary: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
<input type="number" name="salary"><br><br>
<input type="submit" value="Update">
</form>
</body>
</html>