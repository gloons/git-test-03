package project.test.travel.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.test.travel.dao.BoardDAO;
import project.test.travel.dto.BoardFreeVO;


public class FreeViewAction implements Action {

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String url = "/board/freeView.jsp";
    
    String num = request.getParameter("num");
    
    BoardDAO bDao = BoardDAO.getInstance();
    bDao.updateFreeReadCount(num);
    
    BoardFreeVO  bfVo = bDao.selectOneFreeBoardByNum(num);
    
    request.setAttribute("freeList", bfVo);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
    
    
  }

}