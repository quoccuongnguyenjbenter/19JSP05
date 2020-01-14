<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The first JSP</title>
</head>
<body>
	<form action="hello" method="get">
		<div>
			<div style="float: left; width: 10%">Username:</div>
			<div style="float: left; width: 90%">
				<input type="text" value="" name="username" />
			</div>
		</div>
		<br /> <br />
		<div>
			<div style="float: left; width: 10%">Password:</div>
			<div style="float: left; width: 90%">
				<input type="password" value="" name="password" />

			</div>
		</div>
		<br/>
		<br/>
		<div style="margin-left: 150px">
			<input type="submit" value="Login">
		</div>
	</form>
</body>
</html>