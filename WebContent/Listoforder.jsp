<%@page import="com.manisha.user.Users"%>
<%@page import="com.manisha.userdao.UserDAO"%>
<%@page import="com.manisha.order.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.manisha.orderDAO.OrderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>List of orders</h3>
	<%
		Users user = (Users) session.getAttribute("Logged_in_user");
		OrderDAO orderDAO = new OrderDAO();
		List<Order> orderList = orderDAO.listorder(user.getId());
	%>
	<table border="1">
		<thead>
			<tr>
				<th>user id</th>
				<th>Book id</th>

				<th>Status</th>
				<th>Quantity</th>
				<th>order date</th>

			</tr>
		</thead>
		<tbody>
			<%
				for (Order o : orderList) {
					out.println("<tr>");
					out.println("<td>" + o.getUserId() + "</td>");
					out.println("<td>" + o.getBookId() + "</td>");

					out.println("<td>" + o.getStatus() + "</td>");
					out.println("<td>" + o.getQuantity() + "</td>");
					out.println("<td>" + o.getOrderDate() + "</td>");
					out.println("</tr>");
				}
			%>
		</tbody>
	</table>
</body>
</html>