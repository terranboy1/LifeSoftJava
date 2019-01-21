package ch14_string;

public class StringEx5 {

	public static void main(String[] args) {
		
		String jumin="911231-1234567";
		String jumin2="850711-2560022";
		
		//몇년생인지 출력시켜보자.
		String cut = jumin.substring(0, 2);
		int num = Integer.valueOf(cut);
		System.out.println("당신은 " + num + "년생 입니다.");
		
		//남성인지 여성인지 식별하는 출력을 해보자.
		String gender = jumin.substring(7, 8);
		//String문자열 비교하려면 equals. 흔히들 하는 실수가 gender=="1"
		if(gender.equals("1")) {
			System.out.println("남자입니다.");
		} else if(gender.equals("2")) {
			System.out.println("여자입니다.");
		}
	}
}
