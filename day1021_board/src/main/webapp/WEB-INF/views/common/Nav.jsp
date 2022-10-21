<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Header.jsp"%>

<a href="${root }/board/list">[게시판 목록]</a>
<a href="${root }/board/write">[글 작성]</a>

<div>
	<c:choose>
		<c:when test="${empty sessionScope.loginInfo }">
			<form action="${root }/member/login" method="post">
				ID : <input type="text" name="userId">
				PW : <input type="password" name="userPw">					
				<input type="submit" value="LOGIN">
			</form>
		</c:when>
	
		<c:otherwise>
			안녕하세요. <b>${loginInfo.name }</b>(${loginInfo.id })님 *^^*
			<a href="${root }/member/logout">[로그아웃]</a>
			
		</c:otherwise>
	</c:choose>
</div>
<hr>