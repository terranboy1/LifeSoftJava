package ch05_array;

public class CharArray {

	public static void main(String[] args) {
		char[] ch = {'J', 'a', 'v', 'a'};
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		//�빮�ڷ� ��ȯ
		for(int i=0; i<ch.length; i++) {
			System.out.print(Character.toUpperCase(ch[i]));
		}
		
		System.out.println();
		
		//�ҹ��ڷ� ��ȯ
		for(int i=0; i<ch.length; i++) {
			System.out.print(Character.toLowerCase(ch[i]));
		}
		
		System.out.println();
		
		//���� for������ �迭 ���
		for(char c : ch) {
			System.out.print(c + "");
		}
	}
}
