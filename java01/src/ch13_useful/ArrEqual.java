package ch13_useful;

import java.util.Arrays;

public class ArrEqual {

	public static void main(String[] args) {
		//�迭�� ������ Ʋ���� ��. Arrays.equals() �̿�
		
		int[] num1 = {10,20,30,40,50};
		int[] num2 = {10,20,30,40,50};
	// Arrays.equals(�迭1, �迭2) ==> �� �迭�� ���� ��
	// ������ ������ true, �ٸ��� false
		if(Arrays.equals(num1, num2)) {
			System.out.println("�迭�� ������ ����.");
		} else{
			System.out.println("�迭�� ������ Ʋ����.");
		}
	}
}
