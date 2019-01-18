package ch12_inner;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam2 extends Frame{ //F4눌러보면 Type Hierarchy 보임.(Frame클래스가 Window클래스 상속받은거) 
	public InnerExam2() {
		//부모생성자인 Frame클래스의 생성자 호출, Frame클래스는 윈도우 창을 띄워주는 클래스. 프레임의 타이틀 설정
		super("내부 클래스 테스트"); //frame 생성자보면 public Frame(String title)~~ 이런식으로 매개변수가 타이틀 입력할 수 있게 됨.
		//프레임의 가로,세로 사이즈 설정. 이 setSize메서드는 Window.class의 메서드인데 이 Frame클래스가 Windows메서드를 상속받아서 쓸 수 있음.
		setSize(300,400);
		//프레임을 화면에 표시. 실행시 setVisible(true) 안하면 화면 안뜸ㅋㅋ x버튼 눌렀을 때 꺼지라는 컴포넌트 작성해야됨ㅋㅋ 그래도 확대 축소 드래그 이런거 되잖어.. 이것도 만만한게 아니라구..  C언어는 이게 다 수동이라구 주륵..
		setVisible(true); //최신의 JFrame클래스 사용하면 x버튼 누르면 바로 꺼지게 작동하는데 컴포넌트 만드는 연습 하려고 일부러 이렇게 하는거니 귀찮아하지말자 ㅎㅅㅎ
	}
	
	public static void main(String[] args) {
		InnerExam2 e = new InnerExam2();

//		e.addWindowListener(new ); 와, 여기서 ctrl+space로 addWindowListener 인터페이스 임포트해보셈.ㄷㄷ
		e.addWindowListener(new WindowListener() {
					
			//WindowListener인터페이스의 메서드가 총 7개인데 그거 다 구현한거임.
			//나중엔 이런거 다 작성해야됨ㅋㅋ
			//우리가 필요에 의해 작성한건 windowClosing메서드엿지.
			@Override
			public void windowOpened(WindowEvent e) {
			}	
			@Override
			public void windowIconified(WindowEvent e) {			
			}		
			@Override
			public void windowDeiconified(WindowEvent e) {			
			}		
			@Override
			public void windowDeactivated(WindowEvent e) {			
			}	
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
			@Override
			public void windowClosed(WindowEvent e) {		
			}	
			@Override
			public void windowActivated(WindowEvent e) {
			}
			//근데 이렇게 하면 너무 길고 복잡하니까.. WindowAdapter 클래스가 있는데 요게 추상클래스다.
			//요게 WindowListener인터페이스를 implements했다. 그리고 그걸 사용했다.(InnerExam.java)
			
			
		});
 	}
}
