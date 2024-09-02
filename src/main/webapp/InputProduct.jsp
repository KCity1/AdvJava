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
	<h2>Show Result Set</h2>
	<form action="ListProductServlet">
		<input type="submit" value="Show Result Set">
	</form>
	<br><br>
	<h2>Search Category</h2>
	<form action="InputSearch.jsp">
		<input type="submit" value="Search Category">
	</form>
	<h2>Delete Product</h2>
	<form action="deleteItem.jsp">
		<input type="submit" value="Delete Item">
	</form> 
</body>
</html>