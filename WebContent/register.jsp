<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
	<form action="user/register.action" method="post">
		用户名：<input type="text" name="user.name"/><br>
		年龄：<input type="text" name="user.age"/><br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>