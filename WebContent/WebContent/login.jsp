<!DOCTYPE HTML>
<html>
<head>
	<title> BookApp_register</title> 
</head>
<body>
	<h3>BOOK APPLICATION</h3>
	<h3>login</h3>
<form action=Loginservlet>
<%String errorMessage=(String)request.getAttribute("error message");
if(errorMessage !=null){
out.println(errorMessage);
}
 %>
 </br>
Email:<input type="email"name="email" required autofocus><br>
Password:<input type="password"name="password" required><br>

<button type="submit">login</button>

</form>	
<br/>
<a href="register.html">Create account</a>
</body>
</html>
