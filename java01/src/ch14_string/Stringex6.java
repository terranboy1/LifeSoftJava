package ch14_string;

public class Stringex6 {

	public static void main(String[] args) {
		//�� ������ �����ڿ� �޼��� ����غ����� ���� �����Ŵ�. 
		
		Gender gd = new Gender("900711-1560022");
		Gender gd2 = new Gender("900711-2560022");
		Gender gd3 = new Gender("900711-5560022");
	}
}

class Gender {
	String regNum;  //900711-1560022���ڿ�
	
	Gender(String regNum){
		this.regNum = regNum;
		genderCheck(regNum);
	}
	
	public void genderCheck(String regNum) {
		String gender = regNum.substring(7, 8);
		int genderNum = Integer.parseInt(gender);
		
		if(genderNum==1) {
			System.out.println("�����Դϴ�.");
		} else if(genderNum==2) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("��ȿ�� ���� �ƴմϴ�.");
		}
	}
	
}
