package project.test.travel.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.test.travel.dao.BoardDAO;
import project.test.travel.dto.UserVO;

public class JoinAction implements Action {

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      UserVO uVo = new UserVO();
      
      uVo.setEmail(request.getParameter("email"));
      uVo.setPwd(request.getParameter("pwd"));
      uVo.setName(request.getParameter("name"));
      uVo.setNickname(request.getParameter("nickname"));
      uVo.setPhone(request.getParameter("phone"));
      uVo.setGender(Integer.parseInt(request.getParameter("gender")));
//      uVo.setPoint(Integer.parseInt(request.getParameter("point")));
      
            
      BoardDAO bDao = BoardDAO.getInstance();
      bDao.insertUser(uVo);
      
//      new BoardListAction().execute(request, response);    
    
  }

}
