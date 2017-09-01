package project.test.travel.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.test.travel.dao.BoardDAO;
import project.test.travel.dto.BoardVO;

public class BoardListAction implements Action {
  public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String url = "board/boardList.jsp";
    
    BoardDAO bDao = BoardDAO.getInstance();
    
    List<BoardVO> boardList = bDao.selectALLBoards();
    
    request.setAttribute("boardList", boardList);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
  }
}
