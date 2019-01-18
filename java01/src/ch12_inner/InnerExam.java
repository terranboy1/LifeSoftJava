/* 
이 코드 설명을 위해 알아야 할 것들
-------------------------------------------------
java.awt 패키지의 Frame class : 윈도우 관련 기능 제공
public class InnerExam ex
 
 
 
 */


package ch12_inner;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerExam extends Frame{ //F4눌러보면 Type Hierarchy 보임.(Frame클래스가 Window클래스 상속받은거) 
	public InnerExam() {
		//부모생성자인 Frame클래스의 생성자 호출, Frame클래스는 윈도우 창을 띄워주는 클래스. 프레임의 타이틀 설정
		super("내부 클래스 테스트"); //frame 생성자보면 public Frame(String title)~~ 이런식으로 매개변수가 타이틀 입력할 수 있게 됨.
		//프레임의 가로,세로 사이즈 설정. 이 setSize메서드는 Window.class의 메서드인데 이 Frame클래스가 Windows메서드를 상속받아서 쓸 수 있음.
		setSize(300,400);
		//프레임을 화면에 표시. 실행시 setVisible(true) 안하면 화면 안뜸ㅋㅋ x버튼 눌렀을 때 꺼지라는 컴포넌트 작성해야됨ㅋㅋ 그래도 확대 축소 드래그 이런거 되잖어.. 이것도 만만한게 아니라구..  C언어는 이게 다 수동이라구 주륵..
		setVisible(true); //최신의 JFrame클래스 사용하면 x버튼 누르면 바로 꺼지게 작동하는데 컴포넌트 만드는 연습 하려고 일부러 이렇게 하는거니 귀찮아하지말자 ㅎㅅㅎ
	}
	
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		//인스턴스 참조변수에 뭔가를 붙인다..? addWindowListener를 붙였네?? add..추가한다..window를..Listener는 감시자.. 윈도우의 동작을 감시할 수 있는 기능을 추가한다..는 뜻..동작이 감지되면 괄호 안이 실행되는 것이다..앞에서 익명클래스 배운거있지..? 그거야.. 괄호안에 클래스를 넣을거야..
		//오오.. 이 코드 붙이니까 x 누르니까 꺼진다~!!
		e.addWindowListener(new WindowAdapter() {   //다시한번 복습. 익명클래스는 new 자료형(){ } 형태.
			//x 버튼을 누르면 windowClosing메서드가 실행이 되고 exit에 의해 강제 종료된다.
			public void windowClosing(WindowEvent e) {
				System.exit(0);  //exit안의 숫자는 큰 의미가 없는데 관행적으로 0이면 정상종료. -1이면 강제종료라나 뭐라나.. 정확친않음.
			}
		}); 
 	}
}

//보면 알겠지만 자바는 모든 운영체제에 호환이 잘 되는 장점이 있는 반면에
//다른 언어에 비해 코딩량이 많고 그래서 좀 느려..
//파이썬 배우면 코딩량이 적을거야..완전 좋을걸..