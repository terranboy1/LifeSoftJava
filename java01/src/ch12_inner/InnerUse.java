package ch12_inner;
//�������̽� : �߻� method + ����� ���� �� �־���.
interface Flyer {
	public static final int MAX =100;
	public void takeOff(); //�߻�޼ҵ�(�߻�޼���� ����θ� �ִ� �޼����ε� default�޼���, static �޼��� �� �ֽű������ ������ �ۼ��� �� �ְ� �� �͵��� �ִ�. �Ʒ� ������) 
	public void fly(); 
	public void land();
	
	//jdk1.8���� �߰�
	public static void methodA() {
		
	}
	public default void methodB() {
		
	}
}

//InnerUse.class �������� ������
public class InnerUse implements Flyer {
	public static void main(String[] args) {
		//�������̽��� �ν��Ͻ��� ���� �� ����.(�߻�޼��尡 �ֱ� ������ new�� ����. �߻�Ŭ������ ��������)
//		Flyer f = new Flyer(); //�̰� �Ұ���.
		
		Flyer f = new Flyer() {  //�ٵ� �̷��� �߰�ȣ�� ����� ����Ŭ������ �Ǵ°Ŵ�. �߰�ȣ ���� Ŭ������ �Ǵ� ��. �ִ� �̸��� ����. ������ ������ InnerUes$1.class�� ��. '�ܺ�Ŭ����.��ȣ'�� ����.
								 //�̷��� ����Ŭ�����ϸ� ������ ������. �ٵ� �ȵ���̵� �۰��߰����� �ϰԵǸ� �̷��ڵ��� �����Ѵ��. �̷��� ¥�� �ڵ带 �鿩�ٺ��Ⱑ ��ƴ뼭 �������� ������?
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
 *  �츮�� ������ ������� Ŭ������ ����
 *  class Ŭ�����̸�{ }
 * 
 *  �ٵ� �Ʒ��� ���� �̸����� Ŭ���� ����(����Ŭ����, �͸�Ŭ����)
 *  new �ڷ���() { } �Ѱ��ۿ� �� ����.
 *  
 *  
 */ 

