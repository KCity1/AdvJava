<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SearchServlet" method="post">
			Category: <input type="text" name="category">
			<input type="submit">
	</form>
	<%@include file="Header.jsp"%>
</body>
</html>