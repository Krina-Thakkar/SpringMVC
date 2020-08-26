<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
</hr>
<h1>Your registeration is Successful!!!</h1>
<h2>The details you entered are</h2>
<p>Name is ${userRegisterDetails.name}</p>
<p>UserName is ${userRegisterDetails.userName}</p>
<p>Password is ${userRegisterDetails.password}</p>
<p>Country is ${userRegisterDetails.country}</p>
Hobbies are 
<c:forEach var="temp" items="${userRegisterDetails.hobby}">
${temp}
</c:forEach>
<p>Gender is ${userRegisterDetails.gender}</p>
</body>
</html>