function boardCheck() {
  if (document.frm.continent.value.length == 0) {
    alert("대륙을 선택하세요.");
    return false;
  }
  
  if (document.frm.country.value.length == 0) {
    alert("국가를 입력하세요.");
    return  false;
  }
  
  if ((document.frm.cost.value.length == 0) && (document.frm.cost.value > 0)) {
    alert("0보다 큰 값을 입력하세요.");
    return  false;
  }
  
  if (document.frm.title.value.length == 0) {
    alert("제목을 입력하세요.");
    return false;
  }
  
  if (document.frm.nickname.value.length == 0) {
    alert("별명을 입력하세요.");
    return false;
  }
  
  if (document.frm.content.value.length == 0) {
    alert("내용을 입력하세요.");
    return false;
  }
  return true;
}