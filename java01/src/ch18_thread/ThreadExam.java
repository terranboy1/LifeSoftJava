package ch18_thread;

//쓰레드를 사용하는 방법 2가지. Thread를 상속받거나 Runnable인터페이스를 구현하거나. 근데 자바는 다중상속 안되니까 Thread상속받으면 나머지 상속 못받아서 보통 Runnable인터페이스 구현함.
public class ThreadExam extends Thread {
	//main 스레드 실행(하나만 있으면 싱글스레드. 근데 추가로 3개 만들어줬지.)
	public static void main(String[] args) {
		//스레드 생성(기본적인 메인쓰레드 외에 3개의 작업단위가 생긴 것. 순서가 불규칙한 이유는 작업할당이 동시에 이루어지기 때문에.)
		ThreadExam e1 = new ThreadExam(); 
		ThreadExam e2 = new ThreadExam();
		ThreadExam e3 = new ThreadExam();
		//스레드 이름바꾸려면 이렇게 생성자 만들고 부모생성자 호출하거나, setName메서드 호출하면 된다.
	
		e1.setName("스레드1");
		e2.setName("스레드2");
		e3.setName("스레드3");
		//스레드 실행
		e1.start(); //start를 하면 내부로직에 의해 run()을 호출하게 됨.
		e2.start();
		e3.start();
	}
	
	public ThreadExam() {
		
	}
	
	public ThreadExam(String name) { //생성자로 스레드들의 이름을 바꾼다.
		super(name);
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			//현재 실행중인 스레드의 이름 Thread-0, Thread-1, Thread-2.
			//작업단위가 따로따로라 순서가 불규칙.
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { //cpu 간섭 interrupt
				e.printStackTrace();
			} //1초동안 실행을 강제로 멈춰라. 잘 실행되는 cpu를 멈추는 거니까 예외처리가 필요.
		}
	}
}
