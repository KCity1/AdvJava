<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="InputCookieServlet" method="post">
		First Name : <input type="text" name="name"> <br>
		 <input type="submit">
	</form>
	<br><br>
	<a href="ViewCookie.jsp">View Cookie</a>
</body>
</html>