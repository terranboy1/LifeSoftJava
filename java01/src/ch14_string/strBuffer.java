package ch14_string;

public class strBuffer {

	public static void main(String[] args) {
		//StringBuffer�� String�� �޸� ���ڿ��� ������ �ٲ� �� �ִ�.
		//String �Һ�(immutable)
		//StringBuffer,StringBuilder ����(mutable)
		//StringBuffer�� StringBuilder ���� �Ȱ���. ��Ƽ������ ����. StringBuilder�� ���������̶� StringBuffer���� �̰� ������ ����
		//������, �ϴ� ���ڿ� ��ü�� �����ؾ� �Ѵ�.
		StringBuffer sb = new StringBuffer("�ȳ�");
		//StringBuilder sb = new StringBuilder("�ȳ�"); 
		sb.append("������"); //����ȴ�. ������ �ٲ۴�.
		System.out.println(sb);
		
		//StringBuilder�� equals�޼��尡 �������̵��Ǿ����� �ʾƼ� ���ڿ��񱳰� �����. String���� �ٲ㼭 �ؾߵ�.
		
		//StringBuilder�� ���ڿ� ������ �� replace������ �� �ٸ�.
		sb.replace(0, 2, "�Ӵ�");  //�ε���. ������ ��ü�� �ٲ۴�.
		System.out.println(sb);
		String sb2 = sb.substring(2);
		System.out.println(sb2); //������ ��µ�.
	}

}
