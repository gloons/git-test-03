package project.test.travel.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.test.travel.dao.*;

import project.test.travel.dto.BoardVO;


public class BoardWriteAction implements Action {
  public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    BoardVO bVo = new BoardVO();
    
    
    bVo.setContinent(request.getParameter("continent"));
    bVo.setCountry(request.getParameter("country"));
    bVo.setCost(Integer.parseInt(request.getParameter("cost")));
    bVo.setPeriod(Integer.parseInt(request.getParameter("period")));
    bVo.setTitle(request.getParameter("title"));
    bVo.setNickname(request.getParameter("nickname"));
    bVo.setContent(request.getParameter("content"));
    
    BoardDAO bDao = BoardDAO.getInstance();
    bDao.insertBoard(bVo);
    
    new BoardListAction().execute(request, response);    
  }

}
