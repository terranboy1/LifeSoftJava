package ch11_abstract;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//애플릿(Applet) : 웹브라우저에서 실행되는 자바 프로그램.
//(웹브라우저에서 실행되다보니 보안적 문제가 발생한 적이 있었다.
//애플릿이 실행되려면 다운을 받아야하는데 거기에 악성코드를 심은 사례가 많았음
//그래서 웹브라우저에서 많이 애플릿 차단하게됨..
//그래서 오라클에서 애플릿 쓰지 않길 권고함.
//그래서 애플릿 말고 프레임이라던지 다른 방법을 이용해 하는 게 있음. 일단 여긴 애플릿.
public class DrawUse extends Applet {  //Applet클래스 import.(JApplet도 있어요) (자바9버전부턴 사용안하길 권고한다고 짝대기 나온대요)
	//shape1, 2를 클래스 내에서 전역적으로 써야하므로 멤버변수로 선언.
	Draw shape1; 
	Draw shape2;
	
	public DrawUse() {
		System.out.println("생성자 호출");
		shape1 = new DrawCircle(30,30,60,80); //좌우변 자료형이 다르다. Draw가 상속관계에서 위에 있다. Draw는 인터페이스(부모), 우변은 자손클래스. 다형성
		shape2 = new DrawLine(10, 20, 150, 100); // 앞에 2개는 기준 원점좌표, 뒤에2개는 그리기. 자바는 원점이 좌상단이다.
//		setBackground(Color.ORANGE); 이거 작동이 안돼...
	}

	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		System.out.println("paint 호출");
		//drawString("문자열":,x,y)
		g.drawString("자바 그래픽", 100, 60);
		shape1.paint(g);
		shape2.paint(g);
	}
}
//메인메서드가 없는데 꼭 메인메서드가 있어야만 프로그램이 돌아가는건 아니다.
//메인메서드가 필요한 때는 콘솔응용프로그램, 윈도우기반 프로그램에 주로 쓴다.
//안드로이드나 웹프로그램에서 쓰는 경우엔 메인메서드 없을 수 있따.