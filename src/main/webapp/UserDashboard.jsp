<%@page import="com.Listener.UserCountListner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<%--@ page buffer="8kb"--%>
<%@ page isErrorPage="false"%>
<%--@ page buffer="8kb"--%>
<%--@ page buffer="8kb"--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Number of Users: <%=UserCountListner.getUserCounter() %>
</body>
</html>