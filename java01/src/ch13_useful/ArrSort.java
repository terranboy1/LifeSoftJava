package ch13_useful;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrSort {

	public static void main(String[] args) {
		//�������� ���Դٰ� �Ѵ�.(sort�� ������ �����ֳ�. �� �� �ϳ��� �����ض�.)
		//����(sort) - ��������, ��������, ������.. �� ������ ����.
		
		//1. ��������(���� ����)
		int[] num = {50, 40, 70, 90, 120, -20 };
		System.out.println("�����ϱ� ��");
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
		System.out.println("������ ��");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}

		//1. �������� Arrays.sort() �̿�.
		//Arrays.sort(num); //�������� ����
		int[] num1 = {50, 40, 70, 90, 120, -20 };
		System.out.println("\n������ ��");
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));	
	}
}
