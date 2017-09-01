package project.test.travel.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.test.travel.dao.*;
import project.test.travel.dto.BoardFreeVO;



public class FreeWriteAction implements Action {
  public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    BoardFreeVO bfVo = new BoardFreeVO();


    bfVo.setTitle(request.getParameter("title"));
    bfVo.setNickname(request.getParameter("nickname"));
    bfVo.setContent(request.getParameter("content"));

    BoardDAO bDao = BoardDAO.getInstance();
    bDao.insertFreeBoard(bfVo);

    new FreeListAction().execute(request, response);    
  }

}