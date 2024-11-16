<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page isErrorPage="false" errorPage="isErrorPage.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int a = 10;
	int b = 0;
	int sum = 10/0;
%>
${sum}
</body>
</html>