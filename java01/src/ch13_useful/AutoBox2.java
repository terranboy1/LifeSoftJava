package ch13_useful;

public class AutoBox2 {

	public static void main(String[] args) {
		
		//오토박싱 - 객체 안에 value변수 포함
		Integer i1 = 20;
		Integer i2 = new Integer(20);
		
		//오토언박싱 - 객체 안에 포함된 변수 꺼냄. i2는 원래 참조변수이나 출력하면 기본값나옴. 
		System.out.println(i2);
		
	}
}
