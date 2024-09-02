<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	int a;
	<br><br>
	System.out.println("Hi");
	<% 
		int k=10;
	%>
	<br><br>
	
	Print a=> <%=k %>
	<br>
	Print 1=> <% out.print(k); %>
	<br><br>
	Print 2=> <%=k %>
</body>
</html>