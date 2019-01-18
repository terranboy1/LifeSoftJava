package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		int[] num = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요.");
			String input = scanner.nextLine();
			num[i] = Integer.parseInt(input);
			sum += num[i];  //배열의 합을 sum에 담음.
		}
		scanner.close();
		
		System.out.println("생성하신 배열은" + Arrays.toString(num)+"입니다.");
		System.out.println("배열의 합은"+sum +"입니다.");
	}
}
