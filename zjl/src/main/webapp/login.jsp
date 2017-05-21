<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-2.1.3.js"></script>
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>

</head>
<body>
	<form action="regist" method="post">    
    	用户名：<input type="text" name="username"/> <br/>
    	密码：<input type="password" name="password"/><br/>
	            爱好:<input type="checkbox" name="hobby" value="睡觉"/>睡觉
			<input type="checkbox" name="hobby" value="听歌"/>听歌
			<input type="checkbox" name="hobby" value="羽毛球"/>羽毛球</br>
	 
		 <input type="submit" value="注册"/>
		 
		 
	</form>
</body>
</html>
