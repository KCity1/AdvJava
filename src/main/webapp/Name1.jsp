<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="NameServlet1" method="post">
		Enter Name => <input type="text" name="name">
		${nameError} <br> <br>
		<input type="submit" value="Convert">
	</form>
</body>
</html>