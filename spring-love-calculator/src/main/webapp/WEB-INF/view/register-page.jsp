<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Please Register Here</h1>
<hr/>
<form:form action="process-registeration" method="get" modelAttribute="userRegisterDetails">
<div align="center">
<p>
<label for="name">Name:</label>
<form:input type="text" id="name" path="name"/>
</p>
<p>
<label for="un">UserName:</label>
<form:input type="text" id="un" path="userName"/>
</p>
<p>
<label for="pwd">Password:</label>
<form:password id="pwd" path="password"/>
</p>
<p>
<label for="country">Country:</label>
<form:select id="country" path="country">
	<form:option value="India" label="India"/>
	<form:option value="USA" label="USA"/>
	<form:option value="AUS" label="Australia"/> 
</form:select>
</p>
<p>
<label>Hobby:</label>
Programming: <form:checkbox path="hobby" value="programming"/>
Travel: <form:checkbox path="hobby" value="travel"/>
Dancing: <form:checkbox path="hobby" value="dancing"/>
Reading: <form:checkbox path="hobby" value="reading"/>
</p>
<p>
<label>Gender:</label>
Male <form:radiobutton path="gender" value="male"/>
Female <form:radiobutton path="gender" value="female"/>
</p>
<input type="submit" value="register"/>
</div>
</form:form>
</body>
</html>