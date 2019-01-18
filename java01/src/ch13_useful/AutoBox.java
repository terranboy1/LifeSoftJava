package ch13_useful;

public class AutoBox {

	public static void main(String[] args) {
		int num1 = 10;
		int num2;
		Integer i1;
		Integer i2 = new Integer(20);
		
		i1 = num1; //오토박싱(값을 주소에 넣음)
		num2 = i2; //오토언박싱(주소에서 값을 꺼냄)
		System.out.println(num1+"\t"+i1);
		System.out.println(num2+"\t"+i2);
		
		
		
	}
}
