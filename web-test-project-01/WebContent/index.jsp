<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여행 후기 사이트</title>

<link rel="stylesheet" type="text/css" href="css/travel.css">
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<div id="header" align="center">
		<div id="login" align="right">			
			<a href="BoardServlet?command=join_write">회원가입</a>
			<a href="BoardServlet?command=login">로그인</a>
		</div>
	</div>	
	<div id="nav" align="center" style="background-color: red">
		<a href="BoardServlet?command=board_list">후기 게시판</a>
		<a href="BoardServlet?command=free_list">자유 게시판</a>
	</div>
	<div id="footer" align="center" style="background-color: green">
		<h1>여행 후기</h1>
	</div>
</body>
</html>
