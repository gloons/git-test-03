<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
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