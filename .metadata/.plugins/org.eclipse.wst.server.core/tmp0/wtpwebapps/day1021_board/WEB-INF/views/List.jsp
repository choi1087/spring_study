<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./common/Header.jsp"%>
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
			<th>no.</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:choose>
			<c:when test="${empty boardPage or empty boardPage.boardList }">
				<tr>
					<td colspan="5">작성된 게시글이 없습니다.</td>
				</tr>
			</c:when>

			<c:otherwise>
				<c:forEach var="b" items="${boardPage.boardList }">
					<tr>
						<td>${b.bno }</td>
						<td><a href="${root }/board/read?bno=${b.bno}">${b.title }</a></td>
						<td>${b.writer }</td>
						<td>${b.writeDate }</td>
						<td>${b.readCount }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>

	<a href="${root }/board/write">[글 쓰러가기]</a>

	<c:if test="${boardPage.startPage > 1 }">
		<a href="${root }/board/list?page=${boardPage.startPage - 1}">[이전]</a>
	</c:if>

	<c:forEach begin="${boardPage.startPage }" end="${ boardPage.endPage}"
		var="i">
		<a href="${root }/board/list?page=${i}">[${i }]</a>
	</c:forEach>

	<c:if test="${boardPage.totalPage > boardPage.endPage }">
		<a href="${root }/board/list?page=${boardPage.endPage + 1}">[다음]</a>
	</c:if>

</body>
</html>