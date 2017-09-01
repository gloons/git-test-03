package project.test.travel.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.test.travel.controller.action.Action;


@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public BoardServlet() {
	  super();
	}
	
	// 서블릿으로 요청이 들어오면 doGet() 메소드에서 모든 작업이 처리되도록 구현
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		System.out.println("BoardServlet에서 요청을 받음을 확인 : " + command);
		
		// 사용자 요청의 알맞은 처리를 위해 ActionFactory의 getAction() 메소드를 호출함.
		ActionFactory af = ActionFactory.getInstance();
		Action action = af.getAction(command);
		
		if (action != null) { // action이 null이 아닐 경우에만 수행한다.
		  action.execute(request, response);
		}
	}

	// post 방식으로 들어오면 doGet으로 처리하게 호출함
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
