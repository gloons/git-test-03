package project.test.travel.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 요청 파라미터를 동일한 메소드로 처리하도록 하기 위한 추상 메소드 정의
/*
 * 다형성을 위해서는 비슷한 형태의 클래스를 여러 개 정의해야 할 경우 클래스 들 사이의 공통적으로 갖는
 * 메소드를 인터페이스 내의 추상 메소드로 정의해 놓고 이 인터페이스의 구현 클래스에서 상속을 받아
 * 서브 클래스에서 적합한 로직을 기술하도록 한다. 이렇게 인터페이스에서 다형성을 위한 메소드를 정의해 놓으면
 * 이를 상속받는 서브 클래스에서 오버라이딩하지 않으면 컴파일 에러가 발생하기 때문에 강제로 동일한 접근 방식을 취할 수 있도록 할 수 있다.
 * 
 * 우리가 작성할 모델들은 컨트롤러에서 요청이 들어오면 작업에 알맞은 모델 내의 비즈니스 로직이 수행되도록 해야 하는데 컨트롤러에서 동일한 방식으로 모델을 접근할 수 있게
 * 하기 위해서는 이들 모델들이 상속 받아야 하는 인터페이스를 설계해두고 이를 상속받아 사용하게 하면 좋다!!!!☆★☆★☆★☆★☆★
 */
public interface Action {
  public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
