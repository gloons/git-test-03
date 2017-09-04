<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Clean Blog - Start Bootstrap Theme</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

    <!-- Custom styles for this template -->
    <link href="css/clean-blog.min.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand" href="index.jsp">Lets go to Somewhere</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="BoardServlet?command=join_write">Sign up</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="BoardServlet?command=login">log in</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="BoardServlet?command=board_list">Epilogue</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="BoardServlet?command=free_list">FreeBoard</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Page Header -->
    <header class="masthead" style="background-image: url('img/contact-bg.jpg')">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="page-heading">
              <h1>Contact Me</h1>
              <span class="subheading">Have questions? I have answers (maybe).</span>
            </div>
          </div>
        </div>
      </div>
    </header>
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