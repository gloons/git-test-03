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
<h1>자유게시글 리스트</h1>
<table class="list">
   <tr>
      <td colspan="5" style="border: white; text-align: right">
         <a href="BoardServlet?command=free_write_form">게시글 등록</a>
      </td>
   </tr>
   <tr>
      <th>번호</th>
      <th>제목</th>
      <th>작성자</th>
      <th>작성일</th>
      <th>조회수</th>
</tr>
   <c:forEach var="freeList" items="${freeList}">
   <tr class="record">
      <td>${freeList.num}</td>
      <td>
         <a href="BoardServlet?command=free_view&num=${freeList.num}">${freeList.title}</a>
         <!--  ${content.title}-->
      </td>
      <td>${freeList.nickname}</td>
      <td><fmt:formatDate value="${freeList.writedate}"/></td>
      <td>${freeList.readcount}</td>
   </c:forEach>
</table>
</div>
</body>
</html>