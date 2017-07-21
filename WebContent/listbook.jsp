<!DOCTYPE HTML>
<%@page import="com.manisha.user.Users"%>
<%@page import="com.manisha.book.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.manisha.bookDAO.BookDAO"%>
<html>
<head>
	<title> BookApp_register</title> 
	</head>
<body>
<%Users user=(Users)session.getAttribute("Logged_in_user"); 
%>

Welcome <%=user.getName() %>!!!
<a href="Logoutservlet">Logout</a>
	<h3>List of books</h3>
	<% 
	BookDAO bookDAO=new BookDAO();
	List<Book>bookList=bookDAO.listbook();
	//out.println("books:"+bookList);
	%>
	<table border="1">
<thead><tr>
<th> id</th>
<th> Name</th>
<th>Price</th>
<th>Published_date</th>
</tr>
</thead>
<tbody>
	<%
	for(Book b:bookList)
	{
		out.println("<tr>");
	out.println("<td>"+b.getId()+"</td>");
	out.println("<td>"+b.getName()+"</td>");
	out.println("<td>"+b.getPrice()+"</td>");
	out.println("<td>"+b.getPublished_date()+"</td>");
	out.println("</tr>");
	}
	%>
</tbody>
</table>
	<!-- <table border="1">
<thead><tr>
<th> id</th>
<th> Name</th>
<th>Price</th>
<th>Published_date</th>
</tr>
</thead>
<tbody>
<tr>
<td>1</td>
<td> java</td>
<td> Rs.250</td>
<td> 2017-05-17</td>
</tr>
<tr>
<td>2</td>
<td> oracle</td>
<td> Rs.5000</td>
<td> 2017-04-11</td>
</tr>
<tr>
<td>3</td>
<td> sql</td>
<td> Rs.485</td>
<td> 2014-12-17</td>
</tr>
</tbody>
</table> -->
<a href="order.jsp">Order book</a>
</body>
</html>
