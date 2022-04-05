<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>

</head>
<body>
<form:errors path="form.*"/>

<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>
Language : <a href="/firstMvcProject/welcome?language=en">English</a>
|<a href="/firstMvcProject/welcome?language=es">Spanish</a>

Theme : <a href="/firstMvcProject/welcome?siteTheme=green">Green</a>
|<a href="/firstMvcProject/welcome?siteTheme=red">Red</a>

<h2>${message}</h2>
<h1>Student Register Form</h1>



<form action="student_register" method="post">
			<table style="with: 50%">
				<tr>
					<td><spring:message code="label.first_name"/></td>
					<td><input type="text" name="first_name" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.last_name"/></td>
					<td><input type="text" name="last_name" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.username"/></td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td><spring:message code="label.password"/></td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.address"/></td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.contact"/></td>
					<td><input type="text" name="contact" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.DOB"/></td>
					<td><input type="text" name="DOB" /></td>
				</tr>
				<tr>
					<td><spring:message code="label.skills"/></td>
					<td><select name="skills" multiple>
							<option><spring:message code="label.soccer"/></option>
							<option><spring:message code="label.music"/></option>
							<option><spring:message code="label.books"/></option>
							</select></td>
				</tr>
				<tr>
					<td><spring:message code="label.attribute"/></td>
					<td><spring:message code="label.attribute1"/><input type="text" name="attributes.attr1" /></td>
					<td><spring:message code="label.attribute2"/><input type="text" name="attributes.attr2" /></td>
					<td><spring:message code="label.attribute3"/><input type="text" name="attributes.attr3" /></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>