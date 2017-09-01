<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<link rel="stylesheet" type="text/css" href="css/travel.css">
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>
<div id="wrap" align="center">
<h1> 유머 게시판 입니다 </h1>
<form name="frm" method="post" action="BoardServlet">
   <input type="hidden" name="command" value="free_write">
   <table>
      <tr>
         <th> 닉네임 </th>
         <td><input type="text" placeholder="닉네임을 입력하세요" name="nickname"></td>
      </tr>
      <tr>
         <th> 제목 </th>
         <td><input type="text" placeholder="제목을 입력하세요" name="title"></td> 
      </tr>
      <tr>
         <th> 내용 </th>
         <td><textarea cols="70" rows="15" placeholder="내용을 자세히 써주세요" name="content"></textarea></td>
      </tr>
   </table>
   <br><br>
   <input type="submit" value="등록" onclick="return freeCheck()">
   <input type="reset" value="다시 작성">
   <input type="button" value="목록" onclick="location.href='BoardServlet?command=free_list'">
</form>
</div>
 
</body>
</html>