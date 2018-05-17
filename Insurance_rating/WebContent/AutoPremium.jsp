<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#page{

    border: 1px solid black;
    padding-top:5px;
    padding-bottom:300px;
}
</style>
<style>
table,tr,th{
border: 1px solid black;  
    border-collapse: collapse;
    }
    table{
    width:100%;}
    th{font-weight:normal;
    text-align:left;}
    select{
    width:100%;}
       </style>
</head>
<body id="page"><center>
<h1 >Calculate Auto insurance premium</h1></center>
<p style=padding-left:50px>Vehicle Model No  <br><br>
Base Premium<br><br></p>
<table>
<tr><th>Factor</th><th>Option</th></tr>
<tr><th>What is the Vehicle type?</th><th><select><option value="1">Diesel</option><option value="2" style=width:100px>Petrol</option></select></th></tr>
<tr><th>Is there proof of earlier insurance</th><th><select><option>Yes</option><option>No</option></select></th></tr></table>
</body>
</html>