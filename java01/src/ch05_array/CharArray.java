package ch05_array;

public class CharArray {

	public static void main(String[] args) {
		char[] ch = {'J', 'a', 'v', 'a'};
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		//대문자로 변환
		for(int i=0; i<ch.length; i++) {
			System.out.print(Character.toUpperCase(ch[i]));
		}
		
		System.out.println();
		
		//소문자로 변환
		for(int i=0; i<ch.length; i++) {
			System.out.print(Character.toLowerCase(ch[i]));
		}
		
		System.out.println();
		
		//향상된 for문으로 배열 출력
		for(char c : ch) {
			System.out.print(c + "");
		}
	}
}
