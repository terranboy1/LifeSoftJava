package ch05_array;

public class StringArray {

	public static void main(String[] args) {
		//��Ʈ�� �迭 ����
		String[] str = {"Java", "JSP", "Android", "Html5"};
		
		//�迭���� �ٸ����(�� ��������)
		String[] str1 = new String[4];   //�������� ����� ���ÿ� �迭 �����ؼ� ����.
		str1[0] = "Java";                //���� �迭�� �ֱ�
		str1[1] = "Jsp";
		str1[2] = "Android";
		str1[3] = "Html5";
		
		
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i] + ",");
		}
		
		System.out.println();
		
		for(String ss:str) {
			System.out.print(ss + ",");
		}

	}

}
