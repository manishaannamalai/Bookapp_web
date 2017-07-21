<%@page import="com.manisha.order.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.manisha.orderDAO.OrderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book app</title>
</head>
<body>
<h3>List of orders</h3>
<% 
	OrderDAO orderDAO=new OrderDAO();
	List<Order>orderList=orderDAO.listorder();
	
	%>
	<table border="1">
<thead><tr>
<th>Id</th>
<th> User_id</th>
<th> book_id</th>
<th>status</th>
<th>quantity</th>
<th>order date</th>
</tr>
</thead>
<tbody>
	<%
	for(Order o:orderList)
	{
		out.println("<tr>");
		out.println("<td>"+ o.getId()+"</td>");
	out.println("<td>"+ o.getUserId()+"</td>");
	out.println("<td>"+o.getBookId()+"</td>");
	out.println("<td>"+o.getStatus()+"</td>");
	out.println("<td>"+o.getQuantity()+"</td>");
	out.println("<td>"+o.getOrderDate()+"</td>");

	out.println("</tr>");
	}
	%>
</tbody>
</table>
</body>
</html>