package ch13_useful;

public class Arr {

	public static void main(String[] args) {
		//�迭�� ������ Ʋ���� ��
		int[] num1 = {10, 20, 30, 40, 50};
		int[] num2 = {10, 20, 30, 40, 50};
		boolean b = true;
		if(num1.length != num2.length) {
			b = false;
		} else {
			for(int i=0; i<num1.length; i++) {
				if(num1[i] != num2[i]) {
					b = false;
					break;
				}
			}
		}
		if(b==true) {
			System.out.println("�迭�� ������ �����ϴ�.");
		} else {
			System.out.println("�迭�� ������ Ʋ���ϴ�.");
		}
	}
}
