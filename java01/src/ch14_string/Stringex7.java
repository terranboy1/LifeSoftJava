package ch14_string;

public class Stringex7 {

	public static void main(String[] args) {
		//문자열의 내용을 바꾼다. replace메서드
		//(문자열 내용을 바꾸는 것은 StringBuffer)
		String a = "java programming";
		System.out.println("a.replace(\"java\", \"자바\") = " + a.replace("java", "자바"));
		System.out.println("a=" + a); // 어? 위에서 replace했는데 결과가 안바뀌었어. 응 String은 원본을 작업하지 않아~ 작업하기 전에 복사하고 그걸 바꿔. a는 원본을 출력하는거고. 위에껀 복사본 출력한거고.  
		//a = a.replace("java","자바"); 이렇게 해줘야 바뀌지. 복사본을 만들고 그걸 다시 a에 담아줘야만.
		
		
	}
}