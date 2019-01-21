package ch14_string;

public class StringExam {

	public static void main(String[] args) {
		String str = new String("hello");
		String str1 = "hello"; //자주 사용되므로 이런 형태를 허용함. 그러나 이것은 문자열리터럴로 인식됨. 주소값을 비교할 때 주의해야함.
		
		//참조변수 a는 String의 내용을 가리킴
		//String의 내용은 final char[] value = {'h','e','l','l','o}; 형식으로 저장됨.
		String a = "hello";
		System.out.println(a);
		
		//새로운 String이 만들어지고 a는 기존의 "hello"가 아닌 "java"문자열을 가리키게 됨.
		a="java";
		System.out.println(a);
		
		String aa = "";  // \0
		String ab = " "; // 공백문자 + \0
		String ac = null; // 가리키는 게 없음.
		
		//숫자 300을 출력해보세요.
		//1. String을 숫자로 Integer.parseInt(문자열)
		String a1 ="100";
		String a2 = "200";
		System.out.println(Integer.parseInt(a1) + Integer.parseInt(a2)); //300
		System.out.println(Integer.valueOf(a1)+Integer.valueOf(a2)); //300
		
		//2. 숫자를 String으로
		System.out.println("숫자를 String으로 출력");
		String b1 = 100 + ""; //빈문자열 더해줌
		System.out.println(b1);
		
		b1 = String.valueOf(100); //valueOf메서드 이용. 숫자를 String으로 바꿔주는 내부동작 코드가 있음. (String.valueof는 숫자를 문자열로 바꿔주지만, Integer.valueof는 문자열을 숫자로 바꿔줌. 기억!)
		
		// 3. String을 숫자로 바꾸는 방법 2가지
		// 결과부터 얘기하면 valueOf메서드 내부 코드를 뜯어보면 parseInt와 연결되어있다.
		System.out.println("String을 숫자로 출력");
		String c1 = "100";
		int c2 = Integer.parseInt(c1); // Integer.parseInt 이용
		System.out.println("c2 = " + c2);
		
		String c3 = "200";
		int c4 = Integer.valueOf(c3); // Integer.valueOf 이용.
		System.out.println("c4 = " + c4);
		
		// 4. boolean의 경우는 똑같아서 걍 true false만 집어넣어도 됨
		System.out.println(true); //true. (이렇게 적는게 편함)
		System.out.println(String.valueOf(true)); //true
		
		// 결론: String이 아닌 자료형을 String으로 바꿀 땐 valueOf메서드를 쓰면된다.
		
		
		
	}

}
