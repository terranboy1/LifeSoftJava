package ch13_useful;

public class Clone implements Cloneable { //clone�޼��带 ����Ϸ��� Cloneable�������̽��� �����ؾ� ��
	int num=10;
	void print() {
		System.out.println(num);
	}

	//clone ġ�� ctrl+space������ Object�� ����. ����ϸ� �ڵ� �������̵�~
	//���� clone�� �������̵��ؼ� ��ġ�� �����ǵ� �̷��� �����ִٴ°� �����ֱ� ���ؼ� �ẻ �ڵ���.
	@Override
	protected Object clone() throws CloneNotSupportedException { //�׸��� clone�޼��� ������ CloneNotSupportedException ���� ó���������.
		return super.clone();
	}
	
	public static void main(String[] args) { //throws CloneNotSupportedException ���ְų� try-catch������ ó�����ְų� ���� �ϳ��ؾ���.
		Clone t1 = new Clone();
		Clone t2 = null;
		try {
			t2 = (Clone)t1.clone();  //ObjectŬ������ clone�޼��� ȣ��. Object�޼���� ����ȯ �������. �캯�� ���������� ���� �����ϱ� ����ȯ �������.
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}

}
