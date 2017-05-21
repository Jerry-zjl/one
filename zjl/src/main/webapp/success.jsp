<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>
	<%-- <table bgcolor="pink" border="1">
		<th>姓名</th>
		<th>年龄</th>
	
	<c:forEach items="${list }" var="user">
		<tr><td>${user.name }</td><td>${user.sex }</td></tr>
		
	</c:forEach>
	</table> --%>
	<form action="qrservlet" >
		<p>Enter Text to create QR Code</p>
		<input name="qrtext" type="text"> <input
			value="生成二维码" type="submit">
	</form>
</body>
</html>