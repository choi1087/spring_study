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

	<form action="${root }/board/write" method="post">
		<table>
			<tr>
				<td>제목:</td>
				<td><input type="text" name="title"></td>
			</tr>

			<tr>
				<td>내용:</td>
				<td><textarea rows="10" cols="10" name="content"></textarea></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="작성완료"></td>
			</tr>

		</table>
	</form>
</body>
</html>