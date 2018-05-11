<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

</head>
<style>
#b1{
    
    border: 1px solid black;
    padding:100px;
    
   
}
</style>
</head>
<body id="b1">
<form action="Login" method="post">
<div id="e1">
<center>
<h2>Login</h2>
UserName:<span style="color:red"> * </span><input type="text" name="uname" required ><br><br>
Password:<span style="color:red"> * </span><input type="password" name="pwd" required><br><br>

<input type="submit" name="submit" value="submit">&nbsp;
<input type="reset" name="clear" value="clear">&nbsp;
<button><a href="Welcomepage.jsp">cancel</a></button>

</center>
</div>
</form>
</body>
</html>