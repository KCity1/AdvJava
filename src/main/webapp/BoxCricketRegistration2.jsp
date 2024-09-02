<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String nameError = (String)request.getAttribute("NameError");
		String SkillError = (String)request.getAttribute("SkillError");
		String StudentNameValue = (String)request.getAttribute("StudentNameValue");
		String StudentSkillValue = (String)request.getAttribute("StudentSkillValue");
	%>
	<h1>Box Cricket Registration !</h1>
	<form action="BoxCricketRegistrationServlet2" method="post">
		<br><br>
		Student Name : <input type="text" name="StudentName" value="<%=StudentNameValue==null?"":StudentNameValue %>"> <%=nameError == null ? "" :nameError%>
		<br><br>
		Skill : <select name="StudentSkill" >  
			<option value="">Select a Skill</option>
			<option value="Bating" <%=StudentSkillValue!=null&&StudentSkillValue.equals("Bating")?"selected":"" %>>Bating</option>
			<option value="Bowling" <%=StudentSkillValue!=null&&StudentSkillValue.equals("Bowling")?"selected":"" %>>Bowling</option>
			<option value="All Rounder" <%=StudentSkillValue!=null&&StudentSkillValue.equals("All Rounder")?"selected":"" %>>All Rounder</option>
		</select> <%=SkillError == null ? "" : SkillError %> 
		<br><br>
		<input value="Registration" type="submit">
	</form>
</body>
</html>