<%@page import="java.sql.ResultSet"%>
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
 ResultSet rs =(ResultSet)request.getAttribute("carList");
 %>
 
 <table border="">
 
 <tr> 
 <th>CarId</th>
 <th>CarModel</th>
 <th>CarBrand</th>
 <th>CarPrice</th>
 <th>Update</th>
 <th>Delete</th>
 
 
 </tr>
 <%
 while(rs.next()) {
	 %>	 
	<tr>
	<td><%=rs.getInt(1) %></td> 
	<td><%=rs.getString(2) %></td> 
	<td><%=rs.getString(3) %></td> 
	<td><%=rs.getString(4)%> </td>  
	</tr>
 <%
 }
 %>
 
 
 
 
 
 </table>

</body>
</html>