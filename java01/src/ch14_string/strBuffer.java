package ch14_string;

public class strBuffer {

	public static void main(String[] args) {
		//StringBuffer는 String과 달리 문자열의 내용을 바꿀 수 있다.
		//String 불변(immutable)
		//StringBuffer,StringBuilder 가변(mutable)
		//StringBuffer와 StringBuilder 사용법 똑같음. 멀티쓰레드 차이. StringBuilder가 개량버전이라 StringBuffer보다 이걸 쓰도록 하자
		//사용법은, 일단 문자열 객체를 생성해야 한다.
		StringBuffer sb = new StringBuffer("안녕");
		//StringBuilder sb = new StringBuilder("안녕"); 
		sb.append("디지몬"); //변경된다. 원본을 바꾼다.
		System.out.println(sb);
		
		//StringBuilder는 equals메서드가 오버라이딩되어있지 않아서 문자열비교가 힘들다. String으로 바꿔서 해야됨.
		
		//StringBuilder는 문자열 변경할 때 replace문법이 좀 다름.
		sb.replace(0, 2, "앙뇽");  //인덱스. 원본을 자체로 바꾼다.
		System.out.println(sb);
		String sb2 = sb.substring(2);
		System.out.println(sb2); //디지몬만 출력됨.
	}

}
