package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		int[] num = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1) + "��° ���ڸ� �Է��ϼ���.");
			String input = scanner.nextLine();
			num[i] = Integer.parseInt(input);
			sum += num[i];  //�迭�� ���� sum�� ����.
		}
		scanner.close();
		
		System.out.println("�����Ͻ� �迭��" + Arrays.toString(num)+"�Դϴ�.");
		System.out.println("�迭�� ����"+sum +"�Դϴ�.");
	}
}
