<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%! public int sum(int a, int b){
	return a+b;
} %>
<title>In ra chan le</title>
</head>
<body>

<% int c=sum(5,3);
	if(c%2==0){%>
		<h1>La So Chan</h1>
	<%}else{ %>
	<h1>La So Le</h1>
	<%} %>



</body>
</html>