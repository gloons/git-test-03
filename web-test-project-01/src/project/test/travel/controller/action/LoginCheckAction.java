package project.test.travel.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import project.test.travel.dao.BoardDAO;
import project.test.travel.dto.UserVO;


public class LoginCheckAction implements Action {

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    HttpSession session = request.getSession();
    UserVO uVo  = new UserVO(); 
    String url = null;

    String email = request.getParameter("email");
    String pwd = request.getParameter("pwd");

    
    BoardDAO bDao = BoardDAO.getInstance();
    
    
    uVo = bDao.selectAllUser(email);

    if (uVo.getPwd().equals(pwd)) { // 성공
      session.getAttribute("email");
      url = "index.jsp";
    } else {
      url = "/board/boardCheckPass.jsp";
      request.setAttribute("message", "비밀번호가 틀렸습니다.");
    }

    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
  }

}


