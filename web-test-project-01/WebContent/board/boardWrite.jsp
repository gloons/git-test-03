<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>
<div id="wrap" align="center">
<h1> 여행 후기 등록해버리기 </h1>
<form name="frm" method="post" action="BoardServlet">
	<input type="hidden" name="command" value="board_write">
	<table>
		<tr>
			<th> 대륙 </th>
			<td>
				<select name="continent">
					<option value="">대륙선택</option>
					<option value="아시아">아시아</option>
					<option value="북아메리카">북아메리카</option>
					<option value="유럽">유럽</option>
				</select> * 필수 
			</td>
		</tr>
		<tr>
			<th> 국가 </th>
			<td>
				<select name="country">
					<option value="">국가선택</option>
					<option value="일본">일본</option>
					<option value="중국">중국</option>
				</select> * 필수 
			</td>
		</tr>
		<tr>
			<th> 비용 </th>
			<td><input type="text" placeholder="대략의 비용을 적어주세요" name="cost"> 원(\)</td>
		</tr>
		<tr>
			<th> 기간 </th>
			<td><input type="text" placeholder="몇일을 소요했나요?" name="period"> 일</td> 
		</tr>
		<tr>
			<th> 제목 </th>
			<td><input type="text" placeholder="제목을 입력하세요" name="title"></td> 
		</tr>
		<tr>
			<th> 닉네임 </th>
			<td><input type="text" placeholder="별명을 입력하세요" name="nickname"></td> 
		</tr>
		<tr>
			<th> 내용 </th>
			<td><textarea cols="70" rows="15" placeholder="내용을 자세히 써주세요" name="content"></textarea></td>
		</tr>
	</table>
	<br><br>
	<input type="submit" value="등록" onclick="return boardCheck()">
	<input type="reset" value="다시 작성">
	<input type="button" value="목록" onclick="location.href='BoardServlet?command=board_list'">
</form>
</div>
 
</body>
</html>