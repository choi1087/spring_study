<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
여기는 bbb.jsp view가 만드는 html 화면입니다. 하지만 이제 이 친구는 직접 요청을 받지는 못한다.<br>

자, 여기 controller로부터 전달된 데이터가 하나 있다 <br>
메시지 : ${msg }<br>
이름 : ${name }<br>
나이: ${age }<br>

</body>
</html>