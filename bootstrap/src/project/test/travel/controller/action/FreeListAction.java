package project.test.travel.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.test.travel.dao.BoardDAO;
import project.test.travel.dto.BoardFreeVO;

public class FreeListAction implements Action {

  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String url = "board/freeList.jsp";
    
    BoardDAO bDao = BoardDAO.getInstance();
    
    List<BoardFreeVO> freeList = bDao.selectAllFreeBoard();
    
    request.setAttribute("freeList", freeList);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
    
  }

}
