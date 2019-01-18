package ch12_inner;

public class StaticInner { // 외부클래스
	static int x = 10;
	
	int getX() {
		return x;
	}

	static class Inner { // static 내부클래스
		int getX() {
			return x+10;
		}
	}

	public static void main(String[] args) {
	//static inner class : 외부클래스의 참조변수가 없어도 생성 가능.
		StaticInner.Inner in = new StaticInner.Inner(); //외부클래스.내부클래스.   스태틱멤버는 클래스이름.멤버 이런식으로 사용했지.
		System.out.println(x);
		System.out.println(in.getX());
		
		
		StaticInner out = new StaticInner(); //이건 int getX() 메서드 호출하는건데, 
		out.getX();                          //스태틱이 인스턴스멤버 사용하려면 객체 생성해야된다는거 기억하지? 생성시점때문에~
	}
}
