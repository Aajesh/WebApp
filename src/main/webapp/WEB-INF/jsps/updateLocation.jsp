<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>
</head>
<body>
	<form action="updateLoc" method="post">
		<table cellpadding="5" width="20%" bgcolor="99FFFF" align="center"
			cellspacing="10">
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id" size="30"
					value="${location.id}" readonly />
			</tr>

			<tr>
				<td>Code:</td>
				<td><input type="text" name="code" size="30"
					value="${location.code}" />
			</tr>

			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" size="30"
					value="${location.name}" />
			</tr>
			<tr>
				<td>Type:</td>
				<td><input type="radio" name="type" value="URBAN" size="10"
					${location.type='URBAN'?'checked':''} />Urban
					 <input type="radio" name="type" value="RURAL" size="10"
					${location.type='RURAL'?'checked':''} />Rural</td>
			</tr>
			<br>
			<tr>
				<td></td>
				<td><input type="submit" name="save" /></td>
			</tr>

		</table>
	</form>
</body>
</html>