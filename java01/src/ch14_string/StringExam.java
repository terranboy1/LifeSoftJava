package ch14_string;

public class StringExam {

	public static void main(String[] args) {
		String str = new String("hello");
		String str1 = "hello"; //���� ���ǹǷ� �̷� ���¸� �����. �׷��� �̰��� ���ڿ����ͷ��� �νĵ�. �ּҰ��� ���� �� �����ؾ���.
		
		//�������� a�� String�� ������ ����Ŵ
		//String�� ������ final char[] value = {'h','e','l','l','o}; �������� �����.
		String a = "hello";
		System.out.println(a);
		
		//���ο� String�� ��������� a�� ������ "hello"�� �ƴ� "java"���ڿ��� ����Ű�� ��.
		a="java";
		System.out.println(a);
		
		String aa = "";  // \0
		String ab = " "; // ���鹮�� + \0
		String ac = null; // ����Ű�� �� ����.
		
		//���� 300�� ����غ�����.
		//1. String�� ���ڷ� Integer.parseInt(���ڿ�)
		String a1 ="100";
		String a2 = "200";
		System.out.println(Integer.parseInt(a1) + Integer.parseInt(a2)); //300
		System.out.println(Integer.valueOf(a1)+Integer.valueOf(a2)); //300
		
		//2. ���ڸ� String����
		System.out.println("���ڸ� String���� ���");
		String b1 = 100 + ""; //���ڿ� ������
		System.out.println(b1);
		
		b1 = String.valueOf(100); //valueOf�޼��� �̿�. ���ڸ� String���� �ٲ��ִ� ���ε��� �ڵ尡 ����. (String.valueof�� ���ڸ� ���ڿ��� �ٲ�������, Integer.valueof�� ���ڿ��� ���ڷ� �ٲ���. ���!)
		
		// 3. String�� ���ڷ� �ٲٴ� ��� 2����
		// ������� ����ϸ� valueOf�޼��� ���� �ڵ带 ���� parseInt�� ����Ǿ��ִ�.
		System.out.println("String�� ���ڷ� ���");
		String c1 = "100";
		int c2 = Integer.parseInt(c1); // Integer.parseInt �̿�
		System.out.println("c2 = " + c2);
		
		String c3 = "200";
		int c4 = Integer.valueOf(c3); // Integer.valueOf �̿�.
		System.out.println("c4 = " + c4);
		
		// 4. boolean�� ���� �Ȱ��Ƽ� �� true false�� ����־ ��
		System.out.println(true); //true. (�̷��� ���°� ����)
		System.out.println(String.valueOf(true)); //true
		
		// ���: String�� �ƴ� �ڷ����� String���� �ٲ� �� valueOf�޼��带 ����ȴ�.
		
		
		
	}

}
