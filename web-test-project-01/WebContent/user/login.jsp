 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<script type="text/javascript" src="script/member.js" ></script>
</head>
<body>
<h2>로그인</h2>
<form name="frm" method="post" action="BoardServlet">
<input type="hidden" name="command" value="login_check">
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
     <td><input type="submit" value="전송" onclick ="return loginCheck()"> </td>
     <td><input type="reset" value="취소"> </td> 
  </tr>

	<tr><td colspan="2">${message}</td></tr>
	
</table>

</form> 
 
</body>
</html>