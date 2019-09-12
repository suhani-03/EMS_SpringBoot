<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration From</title>
</head>
<style>
img{
    height: 130px;
    position: fixed;
    background-color: lavender;
    background-image: url(pro5.jpeg);
    width: 150px;
    opacity: 0.6; 
    border-radius: 50%;
}
header{
    border: cadetblue;
    border-color: black;
    border-style: hidden;
    height: 150px;
    background-color: lavender;
    background-image: url(pro5.jpeg);
}
span{
    background-image: url(pro5.jpeg);
    background-color: lavender;
    text-align: right;
    color: black;
    float: right;
    font: larger italic;
    font-size: xx-large;
    padding-top: 50px;
}
form{
    border: 3px solid lavender;
    padding-top: 50px;
    padding-left: 200px;
    text-align: justify;
    height: 350px;
    text-decoration: black;
}
#div2{
    background-image: url(pro3.webp);
    
    background-repeat: no-repeat;
}
</style>
<body>
     
    <header>
        <a href="https://www.sakhaglobal.com/">
        <img src="sakhaLogo.png" alt="Sakha Global- Enabling human endeavors">
        </a>
        <span><u>New Employee Registration</u></span>       
    </header>
    
    <div id="div2">
         
        <form action="employee" method="POST">
            
            <br><br>
            <label for="empName"><b>Employee Name:&nbsp;</b></label>
            <input type="text" name="empName" placeholder="Enter Name" required>
            <br><br>
            <label for="age"><b>Employee Age: &nbsp;&nbsp;&nbsp;</b></label>
            <input type="number" name="age" placeholder="Enter Age">
            <br><br>
            <label for="salary"><b>Employee Salary:</b></label>
            <input type="number" name="salary" placeholder="Enter Salry" required>
            <br><br>
            <input type="submit" value="Register">
    		
        </form>
        
    </div>
    
</body>
</html>