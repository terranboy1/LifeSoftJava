// static : �������. ���α׷� ����~������ ������ ���� ( ���� �ٲ� �� ������ �޸𸮿� ��� ������)
// dynamic : 

package ch12_inner;

public class InnerClass {
	
	static int x = 10;
	class Inner { //����Ŭ����
		int getX() {
			return x; //�ܺ��� ��������� �ڱ� ��ó�� ���� �ִ�!
		}
	}
	
	public static void main(String[] args) {
		System.out.println(x);
		InnerClass e = new InnerClass();
		//e.getX(); //���Ұ�. InnerClass�� ���������� �ִ� ����� �ƴ�. �ν��Ͻ��� �ѹ� �� �����ߵ�.
		InnerClass.Inner in = e.new Inner();
	}	
}
