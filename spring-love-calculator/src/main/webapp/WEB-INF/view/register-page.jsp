<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.error{
color:red;
position: fixed;
text-align: left;
margin-left:30px;
}

</style>
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

<label>Age:</label>
<form:input path="Age"/>
<form:errors path="Age" cssClass="error"/>
</div>

<div align="center">
<h3>Communication</h3>
<label>Email</label>
<form:input path="communicationDto.email"/>
<label>Phone</label>
<form:input path="communicationDto.phone"/>
</div>
 
<div align="center">
<input type="submit" value="register"/>
</div>
</form:form>
</body>
</html>