package ch18_thread;

//Runnable 구현하면 run() 오버라이딩하라고 나옴. 혹은 추상클래스로 하라고하거나. 오버라이딩으로 한다.
public class RunnableExam implements Runnable { 

	public static void main(String[] args) {
		RunnableExam e1 = new RunnableExam();
		//스레드 생성 new Thread(Runnable을 구현한 객체). 생성자가 비어있으면 run메서드 호출해도 아무것도 안뜸. 해보면 암.
// 		Thread t1 = new Thread(); 생성자 비어있으면 아무것도 안뜸.
//	 	Thread t2 = new Thread();
//		Thread t1 = new Thread(e1); //스레드가 추가 생성됨. 이름 넣으려면 아래와 같이 생성자에 매개변수 2개
//		Thread t2 = new Thread(e1);
		Thread t1 = new Thread(e1, "스레드1"); //이름바꿀 때 setName호출하는 것도 가능.
		Thread t2 = new Thread(e1, "스레드2");
//		t1.setName("스레드 1");
//		t2.setName("스레드 2");

		
		t1.start(); //스레드 실행 요청=>run()이 실행됨. 이미 만들어진 내부 로직. 이건 꼭 기억.
		t2.start();
	}

	@Override
	public void run() {
		for(int i=1; i<=5; i++) { //스레드 테스트를 위한 for문. 순서는 고정되어있지 않음..
			System.out.println(Thread.currentThread().getName());
			try { 
				Thread.sleep(1000); //1초동안 실행을 강제로 멈춰라. 잘 실행되는 cpu를 멈추는 거니까 예외처리가 필요.
			} catch (InterruptedException e) {
				e.printStackTrace();
		    }
		}
	}
}
