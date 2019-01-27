package ch18_thread;

//�����带 ����ϴ� ��� 2����. Thread�� ��ӹްų� Runnable�������̽��� �����ϰų�. �ٵ� �ڹٴ� ���߻�� �ȵǴϱ� Thread��ӹ����� ������ ��� ���޾Ƽ� ���� Runnable�������̽� ������.
public class ThreadExam extends Thread {
	//main ������ ����(�ϳ��� ������ �̱۽�����. �ٵ� �߰��� 3�� ���������.)
	public static void main(String[] args) {
		//������ ����(�⺻���� ���ξ����� �ܿ� 3���� �۾������� ���� ��. ������ �ұ�Ģ�� ������ �۾��Ҵ��� ���ÿ� �̷������ ������.)
		ThreadExam e1 = new ThreadExam(); 
		ThreadExam e2 = new ThreadExam();
		ThreadExam e3 = new ThreadExam();
		//������ �̸��ٲٷ��� �̷��� ������ ����� �θ������ ȣ���ϰų�, setName�޼��� ȣ���ϸ� �ȴ�.
	
		e1.setName("������1");
		e2.setName("������2");
		e3.setName("������3");
		//������ ����
		e1.start(); //start�� �ϸ� ���η����� ���� run()�� ȣ���ϰ� ��.
		e2.start();
		e3.start();
	}
	
	public ThreadExam() {
		
	}
	
	public ThreadExam(String name) { //�����ڷ� ��������� �̸��� �ٲ۴�.
		super(name);
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			//���� �������� �������� �̸� Thread-0, Thread-1, Thread-2.
			//�۾������� ���ε��ζ� ������ �ұ�Ģ.
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { //cpu ���� interrupt
				e.printStackTrace();
			} //1�ʵ��� ������ ������ �����. �� ����Ǵ� cpu�� ���ߴ� �Ŵϱ� ����ó���� �ʿ�.
		}
	}
}
