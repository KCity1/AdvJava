<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="EmployeeRegistrationServlet" method="post">
		<h1>Enter Details:</h1>
		<br>
		<br> First Name: <input type="text" name="FirstName"> <br>
		<br> Email: <input type="text" name="Email"> <br>
		<br> Password: <input type="password" name="Password"><br>
		<br> Date Of Birth: <input type="date" name="DOB"><br>
		<br> <input type="submit">
	</form>
</body>
</html>