<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./common/Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="./common/Nav.jsp"></jsp:include>
	
	<table border="1">
		<tr>
			<td>제목</td>
			<td>${board.title }</td>
		</tr>

		<tr>
			<td>작성자</td>
			<td>${board.writer }</td>
		</tr>

		<tr>
			<td>작성일시</td>
			<td>${board.writeDate }</td>
		</tr>

		<tr>
			<td>조회수</td>
			<td>${board.readCount }</td>
		</tr>

		<tr>
			<td>내용</td>
			<td>${board.content }</td>
		</tr>
	</table>

	<a href="${root }/board/list">[게시판 목록 보러가기]</a>
</body>
</html>