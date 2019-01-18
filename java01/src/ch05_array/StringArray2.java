package ch05_array;

import java.util.Arrays;

public class StringArray2 {

	public static void main(String[] args) {
		
		//위대한 한국어[배열 랜덤 섞어서 출력하기]
		String[] str = {" 니들 언어는 ", " 이런거 ", " 돼? ", " 씨발 "};
		
		
		
		for(int i=1; i<10; i++) {
			int n = (int)(Math.random()*str.length);	
			String tmp = str[0];
			str[0] = str[n];
			str[n] = tmp;
	
				System.out.println(Arrays.toString(str));
		}

		

	}

}
