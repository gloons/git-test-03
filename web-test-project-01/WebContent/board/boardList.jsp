<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>

<link rel="stylesheet" type="text/css" href="css/travel.css">
</head>
<body>
<div id="wrap" align="center">
<h1>게시글 리스트</h1>
<table class="list">
	<tr>
		<td colspan="9" style="border: white; text-align: right">
			<a href="BoardServlet?command=board_write_form">게시글 등록</a>
		</td>
	</tr>
	<tr>
		<th>번호</th>
		<th>대륙</th>
		<th>국가</th>
		<th>비용</th>
		<th>기간</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
</tr>
	<c:forEach var="content" items="${boardList}">
	<tr class="record">
		<td>${content.num}</td>
		<td>${content.continent}</td>
		<td>${content.country}</td>
		<td>${content.cost}</td>
		<td>${content.period}</td>
		<td>
			<a href="BoardServlet?command=board_view&num=${content.num}">${content.title}</a>
			<!--  ${content.title}-->
		</td>
		<td>${content.nickname}</td>
		<td><fmt:formatDate value="${content.writedate}"/></td>
		<td>${content.readcount}</td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>