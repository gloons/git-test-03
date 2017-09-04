<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
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
    <header class="masthead" style="background-image: url('img/about-bg.jpg')">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="page-heading">
              <h1>About Me</h1>
              <span class="subheading">This is what I do.</span>
            </div>
          </div>
        </div>
      </div>
    </header>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력 창</title>
<script type="text/javascript" src="script/member.js" ></script>
</head>
<body>
<h2>회원 가입</h2>
	<form name="frm" method="post" action="BoardServlet">
		<input type="hidden" name="command" value="add_join">
		<table>
	   <tr>
	  	<td>이메일</td>
	   	<td><input type="text" name="email" size ="20"></td>
	   </tr>	
		 <tr>
		  <td>비밀번호</td>
		  <td><input type="password" name="pwd" size ="20"></td>
		 </tr>
		 <tr>
	  	<td>이름</td>
	   	<td><input type="text" name="name" size ="20"></td>
	   	</tr>
	   <tr>
	  	<td>닉네임</td>
	   	<td><input type="text" name="nickname" size ="20"></td>
	   </tr>
	   <tr>
	  	<td>전화번호</td>
	   	<td><input type="text" name="phone" size ="20"></td>
	  </tr>    
	  <tr>
	   <td>성별</td>
	   <td>
	   	<input type="radio" value="0" name="gender" checked="checked">남자
	   	<input type="radio" value="1" name="gender">여자
	   </td>
	  </tr> 
	 	<tr>
	   <td><input type="submit" value="확인" onclick="return JoinCheck()"> </td>
	   <td><input type="reset" value="취소"> </td>
	  </tr>
		</table>
	</form> 

</body>
</html>