<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="./common/Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="./common/Nav.jsp"></jsp:include>

<table>
	<tr>
		<td>isbn</td>
		<td>title</td>
		<td>author</td>
		<td>price</td>
		<td>content</td>
		<td>img</td>
	</tr>
	<c:choose>
		<c:when test="${empty bookPage or empty bookPage.bookList }">
			<tr>
				<td colspan="6"> 책 없음 ;; </td>
			</tr>
		</c:when>
		
		<c:otherwise>
			<c:forEach var="b" items="${bookPage.bookList }">
				<tr>
					<td>${b.isbn }</td>
					<td>${b.title }</td>
					<td>${b.author }</td>
					<td>${b.price }</td>
					<td>${b.content }</td>
					<td>${b.img }</td>
				</tr>			
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>

</body>
</html>