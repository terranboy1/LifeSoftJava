package ch12_inner;

public class CodeBlocks {

	public static void main(String[] argv) {

		Number number = new Number();
		Float floatObj = new Float(1.0);

		setValues(number);
		System.out.println(number.x);
		
		floatObj = setValues(floatObj);	
		System.out.println(floatObj);

	}
	
	static void setValues(Number number) {
		number.x = 10;
	}

	private static float setValues(Float floatObj) {

		return Float.valueOf((float) 2.0);

	}
}

class Number {
	int x = 5;
}