package ch13_useful;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrSort {

	public static void main(String[] args) {
		//면접질문 나왔다고 한다.(sort의 종류가 뭐가있냐. 그 중 하나를 설명해라.)
		//정렬(sort) - 버블정렬, 선택정렬, 퀵정렬.. 등 종류가 많다.
		
		//1. 버블정렬(직접 구현)
		int[] num = {50, 40, 70, 90, 120, -20 };
		System.out.println("정렬하기 전");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		int temp=0;
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}		
		System.out.println("정렬한 후");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}

		//1. 버블정렬 Arrays.sort() 이용.
		//Arrays.sort(num); //오름차순 정렬
		int[] num1 = {50, 40, 70, 90, 120, -20 };
		System.out.println("\n정렬한 후");
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));	
	}
}
