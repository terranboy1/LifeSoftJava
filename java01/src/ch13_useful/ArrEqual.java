package ch13_useful;

import java.util.Arrays;

public class ArrEqual {

	public static void main(String[] args) {
		//배열이 같은지 틀린지 비교. Arrays.equals() 이용
		
		int[] num1 = {10,20,30,40,50};
		int[] num2 = {10,20,30,40,50};
	// Arrays.equals(배열1, 배열2) ==> 두 배열의 내용 비교
	// 내용이 같으면 true, 다르면 false
		if(Arrays.equals(num1, num2)) {
			System.out.println("배열의 내용이 같다.");
		} else{
			System.out.println("배열의 내용이 틀리다.");
		}
	}
}
