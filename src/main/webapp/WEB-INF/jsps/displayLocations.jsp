<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>  
table, th, td {  
    border: 1px solid black;  
    border-collapse: collapse;  
}  
th, td {
    padding: 10px;
}
</style>
</head>
<body>
<h2>Locations:</h2>

<table style="width:100%"> 
<tr>
<th>id</th>
<th>code</th>
<th>name</th>
<th>type</th>

</tr>

<tr>
<c:forEach items="${locations}" var="location">
<tr>
<th>${location.id}</th>
<th>${location.code}</th>
<th>${location.name}</th>
<th>${location.type}</th>

<th><a href="deleteLocations?id=${location.id}">Delete</a></th>
<th><a href="showUpdate?id=${location.id}">edit</a></th>
</tr>

</c:forEach>
</tr> 
</table>
<a href="showCreate">Add Location</a>
</body>
</html>