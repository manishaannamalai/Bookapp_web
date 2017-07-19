<%@page import="com.manisha.user.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book app</title>
</head>
<body>
<h2>Order books</h2>
<form action="orderservlet">
<% Users user=(Users) session.getAttribute("Logged_in_user"); %>
welcome <%=user.getName() %></br>
<!--<input type="hidden" name="userid"  value="<%=user.getId() %>"autofocus required></br>  -->
Select book:
<select name="bookid" required></br>
<option value="1">c</option>
<option value="2">c++</option>
</select>
<br/>

Quantity:<input type="number" name="quantity" required></br>

<button type="submit"> submit</button>
</form>
</body>
</html>