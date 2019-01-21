package ch14_string;

public class Stringex6 {

	public static void main(String[] args) {
		//이 예제는 생성자와 메서드 사용해보려고 내가 만들어본거다. 
		
		Gender gd = new Gender("900711-1560022");
		Gender gd2 = new Gender("900711-2560022");
		Gender gd3 = new Gender("900711-5560022");
	}
}

class Gender {
	String regNum;  //900711-1560022문자열
	
	Gender(String regNum){
		this.regNum = regNum;
		genderCheck(regNum);
	}
	
	public void genderCheck(String regNum) {
		String gender = regNum.substring(7, 8);
		int genderNum = Integer.parseInt(gender);
		
		if(genderNum==1) {
			System.out.println("남자입니다.");
		} else if(genderNum==2) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("유효한 값이 아닙니다.");
		}
	}
	
}
