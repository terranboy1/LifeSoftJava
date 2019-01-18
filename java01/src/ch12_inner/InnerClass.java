// static : 정적멤버. 프로그램 시작~끝까지 변하지 않음 ( 값은 바뀔 수 있으나 메모리에 계속 상주함)
// dynamic : 

package ch12_inner;

public class InnerClass {
	
	static int x = 10;
	class Inner { //내부클래스
		int getX() {
			return x; //외부의 멤버변수를 자기 것처럼 쓰고 있다!
		}
	}
	
	public static void main(String[] args) {
		System.out.println(x);
		InnerClass e = new InnerClass();
		//e.getX(); //사용불가. InnerClass에 직접적으로 있는 멤버가 아님. 인스턴스를 한번 더 만들어야됨.
		InnerClass.Inner in = e.new Inner();
	}	
}
