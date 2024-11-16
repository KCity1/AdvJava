<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

request : ${requestScope.email}
<br>
Session : ${sessionScope.email}
<br>
Application : ${applicationScope.email}
<br>
<br>

-------------------------------
page,request,session,application
<br>
${firstName}
<br>
${email}
<br>
${location}
</body>
</html>