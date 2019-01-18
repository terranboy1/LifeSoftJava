package ch12_inner;
//인터페이스 : 추상 method + 상수만 가질 수 있었지.
interface Flyer {
	public static final int MAX =100;
	public void takeOff(); //추상메소드(추상메서드는 선언부만 있는 메서드인데 default메서드, static 메서드 등 최신기법으로 내용을 작성할 수 있게 한 것들이 있다. 아래 참조ㅋ) 
	public void fly(); 
	public void land();
	
	//jdk1.8부터 추가
	public static void methodA() {
		
	}
	public default void methodB() {
		
	}
}

//InnerUse.class 형식으로 컴파일
public class InnerUse implements Flyer {
	public static void main(String[] args) {
		//인터페이스는 인스턴스를 만들 수 없음.(추상메서드가 있기 때문에 new를 못함. 추상클래스도 마찬가지)
//		Flyer f = new Flyer(); //이거 불가능.
		
		Flyer f = new Flyer() {  //근데 이렇게 중괄호로 만들면 무명클래스가 되는거다. 중괄호 안이 클래스가 되는 것. 애는 이름이 없다. 컴파일 네임은 InnerUes$1.class로 됨. '외부클래스.번호'로 들어갔음.
								 //이렇게 내부클래스하면 재사용은 못해유. 근데 안드로이드 앱개발같은거 하게되면 이런코딩을 많이한대요. 이렇게 짜면 코드를 들여다보기가 어렵대서 보안측면 때문에?
			@Override
			public void takeOff() {
				// TODO Auto-generated method stub
				System.out.println("takeOff...");
			}

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("fly...");
			}

			@Override
			public void land() {
				// TODO Auto-generated method stub
				System.out.println("land...");
			}  
		};
		f.takeOff();
		f.fly();
		f.land();
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
}

/*
 *  우리가 기존에 만들었던 클래스의 형태
 *  class 클래스이름{ }
 * 
 *  근데 아래와 같이 이름없는 클래스 형태(무명클래스, 익명클래스)
 *  new 자료형() { } 한개밖에 못 찍어낸다.
 *  
 *  
 */ 

