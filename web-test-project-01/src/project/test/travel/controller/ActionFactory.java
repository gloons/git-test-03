package project.test.travel.controller;

import project.test.travel.controller.action.*;

public class ActionFactory {
  private static ActionFactory instance = new ActionFactory(); // 싱글톤 형태
  
  private ActionFactory() {
    super();
  }
  
  public static ActionFactory getInstance() {
    return instance;
  }
  
  public Action getAction(String command) {
    Action action = null;
    System.out.println("ActionFactory : " + command);
    
    if (command.equals("board_list")) {
      action = new BoardListAction();
    } else if (command.equals("free_list")) {
      action = new FreeListAction();
    } else if (command.equals("board_write_form")) {
      action = new BoardWriteFormAction();
    } else if (command.equals("board_write")) {
      action = new BoardWriteAction();
    } else if (command.equals("add_join")) {
      action = new JoinAction();
    } else if (command.equals("join_write")) {
      action = new AddJoinAction();
    } else if (command.equals("login")) {
      action = new LoginAction();
    } else if (command.equals("login_check")) {
      action = new LoginCheckAction();
    } else if (command.equals("board_view")) {
      action = new BoardViewAction();
    } else if (command.equals("free_write_form")) {
      action = new FreeWriteFormAction();
    } else if (command.equals("free_write")) {
      action = new FreeWriteAction();
    } else if (command.equals("free_view")) {
      action = new FreeViewAction();
    }
    return action;
  }

}