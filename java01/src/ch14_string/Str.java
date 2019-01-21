package ch14_string;

public class Str {

	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		System.out.println(str.toUpperCase()); // 새로운 문자열이 생성되어서 출력은 되지만(String constant pool), 참조변수에 담지않으면 가비지컬렉터에 의해 수거됨.
		System.out.println(str.toLowerCase());
		System.out.println(str); //원본 변경되지 않았음.
		//값을 바꿀려면 참조변수가 가리키게 해야함.
		str = str.toLowerCase();  //원본이 변경됨.
		System.out.println(str);
		
		str = "";
		System.out.println("내용: " + str);
		str = null;
		System.out.println("내용: " + str);
//		System.out.println(str.length()); NullPointerException. null인데(가리키는 게 없는데) 글자수를 찍으라니까 에러뜸.
		
		char ch = '\0';  //기본값. 널문자(null character)
		System.out.println("내용: "+ch + ", code:" + (int)ch);
		ch = ' ';
		System.out.println("내용: "+ch + ", code:" + (int)ch);
	  //ch =''; 아무것도 안쓰면 에러. 기본값 주고싶으면 \0 주면 됨.
		
		
		//문자열을 붙여보자
		
		//1. 그냥 더하기
		String a = "Hello";
		a += ", java";
		System.out.println(a);
		
		//2. concat메서드
		a.concat("안녕 자바"); // 이것도 이렇게만 해주면 원본 복사 안된다~
		System.out.println();
		a = a.concat(" = 안녕 자바");
		System.out.println(a);
		
		
		//한 글자만 뽑아보자.
		String b = "ABCDE";
		char b1 = b.charAt(0);
		System.out.println(b1);
		char b2 = b.charAt(1);
		System.out.println(b2);
		
		//해당 글자가 몇번째 인덱스인가?
		String c = "abcdefgda";
		int index = c.indexOf("d"); //문자열 d는 몇번째 인덱스인가요?
		System.out.println(index);
		int index1 = c.indexOf("bcde"); //문자열 bcde는 몇번째에 있나요?
		System.out.println(index1); //입력한 문자열에서 첫번째 문자의 인덱스가 반환된다.
		int index2 = c.indexOf("Kk"); //입력한 문자열이 없으면?
		System.out.println(index2); // -1이 반환된다.
		
		int index3 = c.lastIndexOf("g"); //문자열a는 뒤에서 몇번째 인덱스인가요?(중복되는 게 없으면 indexof와 결과가 같지만 중복문자가 있으면 뒤에서 인덱스를 센다.)
		System.out.println(index3); //중복되는게 없으므로 그냥 index의 결과와 같다.
		int index4 = c.lastIndexOf("a");
		System.out.println(index4); //뒤에서 셌을 때 가까운 인덱스인 8이 반환된다.
		//응용해봅시다.
		//오. indexof를  응용하면 파일 색인이 되는구나.
		if(c.indexOf("efg") != -1) { //efg는 있고 index는 4가 반환되겠군
			System.out.println("찾는 문자열이 있습니다.");
		}
		
		if(c.indexOf("오바마") != -1) { //찾는 문자열이 없으므로 -1이겠구나.
			System.out.println("찾는 문자열이 있습니다.");
		} else {
			System.out.println("찾는 문자열이 없습니다.");
		}
		
		//원하는 문자열을 뽑아봅시다.
		String d = "자바는 너무 재밌어!!";
		//"자바는" 뽑아보자.
		String d1 = d.substring(0,3);
		System.out.println(d1);
		//"너무재밌어"를 뽑아보자.(2가지 방법이 있군)
		String d2 = d.substring(4); //index 1개만 입력하면 해당 인덱스부터 뒤로 다 출력.
		System.out.println(d2);
		String d3 = d.substring(4,12);
		System.out.println(d3);
		//문자열을 바꿔보자.("자바"->"JSP")
		String d4 = d.replace("자바", "JSP"); //이것도 원본을 바꾸는 게 아니기떄문에 변경값을 담아줘야한다.
		System.out.println(d4);
	}
}
