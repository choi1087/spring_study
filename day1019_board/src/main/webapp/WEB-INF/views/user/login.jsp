<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${pageContext.request.contextPath }/member/login" method="post">
		ID : <input type="text" name="userid"><br>
		PW : <input type="password" name="userpwd"><br>
		<input type="submit" value="로그인">
		
		<div>${msg }</div>
	</form>

</body>
</html>