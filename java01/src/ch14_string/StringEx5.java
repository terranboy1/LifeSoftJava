package ch14_string;

public class StringEx5 {

	public static void main(String[] args) {
		
		String jumin="911231-1234567";
		String jumin2="850711-2560022";
		
		//�������� ��½��Ѻ���.
		String cut = jumin.substring(0, 2);
		int num = Integer.valueOf(cut);
		System.out.println("����� " + num + "��� �Դϴ�.");
		
		//�������� �������� �ĺ��ϴ� ����� �غ���.
		String gender = jumin.substring(7, 8);
		//String���ڿ� ���Ϸ��� equals. ������ �ϴ� �Ǽ��� gender=="1"
		if(gender.equals("1")) {
			System.out.println("�����Դϴ�.");
		} else if(gender.equals("2")) {
			System.out.println("�����Դϴ�.");
		}
	}
}
