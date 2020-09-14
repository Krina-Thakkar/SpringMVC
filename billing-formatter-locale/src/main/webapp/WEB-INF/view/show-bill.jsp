<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
	<h2 align="center">Bill</h2>

	<div align="center">
		<form:form method="get" action="result" modelAttribute="billInfo">
		
			<label for="cardNumber">Enter Card number:</label>
			<form:input path="creditCard" id="cardNumber" maxlength="19"/> <br/> <br/>
			
			<label for="amount">Amount:</label> 
			<form:input path="amount" id="amount"/>
			<br/> <br/>
			
			<input type="submit" value="Generate"/>
			
		
		</form:form>
	
	
	</div>
</body>
</html>