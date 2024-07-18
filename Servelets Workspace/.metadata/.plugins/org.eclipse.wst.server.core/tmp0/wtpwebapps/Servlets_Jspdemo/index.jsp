<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--Declarative Tag  -->

	<%!int a = 10;
	String name = "James";

	String[] names = { "Messi", "Neymar", "Suarez" };%>

	<!-- Expression Tag -->
	<h2><%=a%></h2>
	<h2><%=name%></h2>

	<!--Scriplet tag  -->

	<%
	for (String n : names) {
	%>
	<%=n%>
	<%
	}
	%>

</body>
</html>