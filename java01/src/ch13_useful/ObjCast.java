package ch13_useful;

public class ObjCast {

	public static void main(String[] args) {
		int a=10;
		Object obj = new Object();

		//�º� �θ�, �캯 �ڽ� => ����
		obj=20;
		//�º� �ڽ�, �캯 �θ� => ����(����ȯ) (����� �ڽ��� ������ ������ �θ� ����. ���������� ���ٰ� ��)
		a = (Integer)obj;
		
		//�迭�� �����ڷ����� ���� �� ������ ������Ʈ�� �ٵ��� �� ����.
		Object[] obj2 = {100, 100.5, true, "hello", 'A'};
		for(Object o : obj2) {
			System.out.println(o);
		}
		
//		for(int i=0; i<obj2.length; i++) {
//			System.out.println(obj2[i]);
//		}
	}

}