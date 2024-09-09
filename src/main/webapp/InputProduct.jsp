<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Product</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("Name");
	String price = (String) request.getAttribute("Price");
	String category = (String) request.getAttribute("category");
	String qty = (String) request.getAttribute("qty");
	%>
	<h1>Enter Product Name</h1>
	<form action="SaveProductServlet" method="post">
		Enter Product Name: <input type="text" name="Name" value="<%=name == null ? "" : name%>">${NameError} <br>
		<br> Enter Price: <input type="text" name="Price" value="<%=price == null ? "" : price%>"> ${PriceError} <br>
		<br> Category: <input type="text" name="category" value="<%=category == null ? "" : category%>">${CategoryError} 
		<br> <br> Quantity: <input type="text" name="qty" value="<%=qty == null ? "" : qty%>"> ${QtyError} <br>
		<br> <input type="submit" value="Save Product">
	</form>
	<br>
	<%@include file="Header.jsp"%>
</body>
</html>