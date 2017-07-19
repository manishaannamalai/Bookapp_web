<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book app</title>
</head>
<body>
<h3>create an account</h3>
<form action="addbook">
Book Name:<input type="text"name="name"required autofocus><br>

price:<input type="integer"name="price" required ><br>
Published date:<input type="date"name="published_date" required><br>

<button type="submit">Create book</button>

</form>	

</body>
</html>