package ch14_string;

public class Str {

	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		System.out.println(str.toUpperCase()); // ���ο� ���ڿ��� �����Ǿ ����� ������(String constant pool), ���������� ���������� �������÷��Ϳ� ���� ���ŵ�.
		System.out.println(str.toLowerCase());
		System.out.println(str); //���� ������� �ʾ���.
		//���� �ٲܷ��� ���������� ����Ű�� �ؾ���.
		str = str.toLowerCase();  //������ �����.
		System.out.println(str);
		
		str = "";
		System.out.println("����: " + str);
		str = null;
		System.out.println("����: " + str);
//		System.out.println(str.length()); NullPointerException. null�ε�(����Ű�� �� ���µ�) ���ڼ��� ������ϱ� ������.
		
		char ch = '\0';  //�⺻��. �ι���(null character)
		System.out.println("����: "+ch + ", code:" + (int)ch);
		ch = ' ';
		System.out.println("����: "+ch + ", code:" + (int)ch);
	  //ch =''; �ƹ��͵� �Ⱦ��� ����. �⺻�� �ְ������ \0 �ָ� ��.
		
		
		//���ڿ��� �ٿ�����
		
		//1. �׳� ���ϱ�
		String a = "Hello";
		a += ", java";
		System.out.println(a);
		
		//2. concat�޼���
		a.concat("�ȳ� �ڹ�"); // �̰͵� �̷��Ը� ���ָ� ���� ���� �ȵȴ�~
		System.out.println();
		a = a.concat(" = �ȳ� �ڹ�");
		System.out.println(a);
		
		
		//�� ���ڸ� �̾ƺ���.
		String b = "ABCDE";
		char b1 = b.charAt(0);
		System.out.println(b1);
		char b2 = b.charAt(1);
		System.out.println(b2);
		
		//�ش� ���ڰ� ���° �ε����ΰ�?
		String c = "abcdefgda";
		int index = c.indexOf("d"); //���ڿ� d�� ���° �ε����ΰ���?
		System.out.println(index);
		int index1 = c.indexOf("bcde"); //���ڿ� bcde�� ���°�� �ֳ���?
		System.out.println(index1); //�Է��� ���ڿ����� ù��° ������ �ε����� ��ȯ�ȴ�.
		int index2 = c.indexOf("Kk"); //�Է��� ���ڿ��� ������?
		System.out.println(index2); // -1�� ��ȯ�ȴ�.
		
		int index3 = c.lastIndexOf("g"); //���ڿ�a�� �ڿ��� ���° �ε����ΰ���?(�ߺ��Ǵ� �� ������ indexof�� ����� ������ �ߺ����ڰ� ������ �ڿ��� �ε����� ����.)
		System.out.println(index3); //�ߺ��Ǵ°� �����Ƿ� �׳� index�� ����� ����.
		int index4 = c.lastIndexOf("a");
		System.out.println(index4); //�ڿ��� ���� �� ����� �ε����� 8�� ��ȯ�ȴ�.
		//�����غ��ô�.
		//��. indexof��  �����ϸ� ���� ������ �Ǵ±���.
		if(c.indexOf("efg") != -1) { //efg�� �ְ� index�� 4�� ��ȯ�ǰڱ�
			System.out.println("ã�� ���ڿ��� �ֽ��ϴ�.");
		}
		
		if(c.indexOf("���ٸ�") != -1) { //ã�� ���ڿ��� �����Ƿ� -1�̰ڱ���.
			System.out.println("ã�� ���ڿ��� �ֽ��ϴ�.");
		} else {
			System.out.println("ã�� ���ڿ��� �����ϴ�.");
		}
		
		//���ϴ� ���ڿ��� �̾ƺ��ô�.
		String d = "�ڹٴ� �ʹ� ��վ�!!";
		//"�ڹٴ�" �̾ƺ���.
		String d1 = d.substring(0,3);
		System.out.println(d1);
		//"�ʹ���վ�"�� �̾ƺ���.(2���� ����� �ֱ�)
		String d2 = d.substring(4); //index 1���� �Է��ϸ� �ش� �ε������� �ڷ� �� ���.
		System.out.println(d2);
		String d3 = d.substring(4,12);
		System.out.println(d3);
		//���ڿ��� �ٲ㺸��.("�ڹ�"->"JSP")
		String d4 = d.replace("�ڹ�", "JSP"); //�̰͵� ������ �ٲٴ� �� �ƴϱ⋚���� ���氪�� �������Ѵ�.
		System.out.println(d4);
	}
}
