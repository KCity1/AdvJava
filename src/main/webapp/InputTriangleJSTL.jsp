<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% int number = (Integer)request.getAttribute("number"); %>
	<c:forEach begin="1" end="${number}" var="x">
		<c:forEach begin="1" end="${x}" var="y">
			<c:out value="${y}"></c:out>
		</c:forEach>
		<br>
	</c:forEach>
</body>
</html>