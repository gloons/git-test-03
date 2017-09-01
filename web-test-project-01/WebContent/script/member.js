/**
 * 
 */

function addjoinFormPopup() {
  window.open("user/addjoinForm.jsp", "회원가입", "width=400,height=300,left=100,top=50");
  self.close();
}
function loginPopup() {
  window.open("user/login.jsp", "로그인", "width=400,height=300,left=100,top=50");
}


function epilogue() {
  window.location.replace("board/boardList.jsp");
}




function JoinCheck() {
  if(document.frm.email.value.length == 0) {
    alert("이메일를 써주세요");
    frm.email.focus();
    return false;
  }

  if(document.frm.pwd.value =="") {
    alert("암호는 반드시 입력해야 합니다.");
    frm.pwd.focus();
    return false;
  }
  if(document.frm.name.value =="") {
    alert("이름을 입력하세요");
    frm.name.focus();
    return false;
  }
  if(document.frm.nickname.value =="") {
    alert("별명을 입력하세요");
    frm.nickname.focus();
    return false;
  }
  if((document.frm.phone.value =="") && (document.frm.phone.value < 14)) {
    alert("핸드폰 번호를 입력하세요");
    frm.phone.focus();
    return false;
  }

  return true;

}

function loginCheck() {
  if(document.frm.email.value.length == 0) {
    alert("이메일을 써주세요");
    frm.email.focus();
    return false;
  }

  if(document.frm.pwd.value =="") {
    alert("암호를 입력 하세요.");
    frm.pwd.focus();
    return false;
  }return true;
}


//아이디 중복체크.. 
function idCheck() {
  if(document.frm.userid.value == "") { // 아이디 입력 받았는지 확인
    alert("아이디를 입력하여 주십시오.");
    document.frm.userid.focus();
    return ;
  }
  //idcheck.jsp 페이지는 idCheck.do로 요청
  //idCheck.do를 요청하면서 입력받은 회원 아이디를 서블릿에 보내 데이터베이스에 이 아이디가 저장되어 있는지 확인
  var url = "idCheck.do?userid=" + document.frm.userid.value; 
  //아이디 중복체크를 위해서 현재 페이지가 아닌 새로운 창에 출력
  window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}
//자바스크립트에서 opener란 이 창을 열어준 부모 창을 말함. 여기서는 회원 가입 폼
function idok() {
  opener.frm.userid.value = document.frm.userid.value; //회원 가입 폼의 아이디를 입력받는 폼에, 중복 체크가 끝난 아이디 값을 넘겨줌
  opener.frm.reid.value = document.frm.userid.value; // reid는 아이디 중복 체크 과정을 거쳤는지 확인하기 위해 회원 가입폼에 만들어둔 히든 태그
  // 히든 태그는 join.jsp 페이지에 있다.
  self.close(); // 중복체크창 닫기
}
//회원가입시 joinCheck 이름, 아이디, 아이디 크기, 암호, 암호일치, 중복체크
function joinCheck() {
  if(document.frm.name.value.length == 0) {
    alert("이름을 써주세요.");
    frm.name.focus();
    return false;
  }

  if(document.frm.userid.value.length == 0) {
    alert("아이디를 써주세요");
    frm.userid.focus();
    return false;
  }
  if(document.frm.userid.value.length < 4) {
    alert("아이디는 4글자이상이어야 합니다.");
    frm.userid.focus();
    return false;
  }
  if(document.frm.pwd.value == "") {
    alert("암호는 반드시 입력해야 합니다.");
    frm.pwd.focus();
    return false;
  }
  if(document.frm.pwd.value != document.frm.pwd_check.value) {
    alert("암호가 일치하지 않습니다.");
    frm.pwd.focus();
    return false;
  }
  if(document.frm.reid.value.length == 0) {
    alert("중복 체크를 하지 않았습니다.");
    frm.userid.focus();
    return false;
  }
  return true;
}
