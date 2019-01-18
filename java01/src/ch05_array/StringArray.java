package ch05_array;

public class StringArray {

	public static void main(String[] args) {
		//스트링 배열 선언
		String[] str = {"Java", "JSP", "Android", "Html5"};
		
		//배열선언 다른방법(더 원시적인)
		String[] str1 = new String[4];   //참조변수 선언과 동시에 배열 생성해서 연결.
		str1[0] = "Java";                //실제 배열값 넣기
		str1[1] = "Jsp";
		str1[2] = "Android";
		str1[3] = "Html5";
		
		
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i] + ",");
		}
		
		System.out.println();
		
		for(String ss:str) {
			System.out.print(ss + ",");
		}

	}

}
