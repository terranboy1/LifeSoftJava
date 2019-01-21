package ch12_inner;

public class StaticInner { // �ܺ�Ŭ����
	static int x = 10;
	
	int getX() {
		return x;
	}

	static class Inner { // static ����Ŭ����
		int getX() {
			return x+10;
		}
	}

	public static void main(String[] args) {
	//static inner class : �ܺ�Ŭ������ ���������� ��� ���� ����.
		StaticInner.Inner in = new StaticInner.Inner(); //�ܺ�Ŭ����.����Ŭ����.   ����ƽ����� Ŭ�����̸�.��� �̷������� �������.
		System.out.println(x);
		System.out.println(in.getX());
		
		
		StaticInner out = new StaticInner();
		out.getX();                          
	}
}
