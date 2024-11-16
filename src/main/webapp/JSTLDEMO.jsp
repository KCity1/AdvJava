<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="x" value="10"></c:set>
	<c:out value="${x}"></c:out>
	
	<c:forEach begin="1" end="5" var="i" step="1">
		Royal:${i}
	</c:forEach>
	<hr>
	<%--y--%>
	<%
		int y = 10;
		if(y%2==0)
		{
			out.print("Even");
		}
		else{
			out.print("Odd");
		}
	%>
	<c:remove var="x"/>
</body>
</html>