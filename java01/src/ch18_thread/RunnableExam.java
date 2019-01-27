package ch18_thread;

//Runnable �����ϸ� run() �������̵��϶�� ����. Ȥ�� �߻�Ŭ������ �϶���ϰų�. �������̵����� �Ѵ�.
public class RunnableExam implements Runnable { 

	public static void main(String[] args) {
		RunnableExam e1 = new RunnableExam();
		//������ ���� new Thread(Runnable�� ������ ��ü). �����ڰ� ��������� run�޼��� ȣ���ص� �ƹ��͵� �ȶ�. �غ��� ��.
// 		Thread t1 = new Thread(); ������ ��������� �ƹ��͵� �ȶ�.
//	 	Thread t2 = new Thread();
//		Thread t1 = new Thread(e1); //�����尡 �߰� ������. �̸� �������� �Ʒ��� ���� �����ڿ� �Ű����� 2��
//		Thread t2 = new Thread(e1);
		Thread t1 = new Thread(e1, "������1"); //�̸��ٲ� �� setNameȣ���ϴ� �͵� ����.
		Thread t2 = new Thread(e1, "������2");
//		t1.setName("������ 1");
//		t2.setName("������ 2");

		
		t1.start(); //������ ���� ��û=>run()�� �����. �̹� ������� ���� ����. �̰� �� ���.
		t2.start();
	}

	@Override
	public void run() {
		for(int i=1; i<=5; i++) { //������ �׽�Ʈ�� ���� for��. ������ �����Ǿ����� ����..
			System.out.println(Thread.currentThread().getName());
			try { 
				Thread.sleep(1000); //1�ʵ��� ������ ������ �����. �� ����Ǵ� cpu�� ���ߴ� �Ŵϱ� ����ó���� �ʿ�.
			} catch (InterruptedException e) {
				e.printStackTrace();
		    }
		}
	}
}
