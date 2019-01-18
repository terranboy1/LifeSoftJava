package ch05_array;

import java.util.Scanner;

public class ArrayPoint {
	public static void main(String[] args) {
		String[] name= {"김철수", "이성용", "성민수", "강찬호", "이순영"};
		int[] kor = {100, 80, 70, 60, 90};
		int[] eng = {80, 90, 95, 85, 75};
		int[] mat = {99, 89, 79, 69, 77};
		//int[] tot=new int[5];
		int[] tot = {0, 0, 0, 0, 0};
		double[] avg=new double[5];
		String[] grade=new String[5];  //등급 배열
		double tot_avg=0; //학급 평균
		for(int i=0; i<5; i++) {
			tot[i]=kor[i]+eng[i]+mat[i]; //총점
			avg[i]=tot[i] / 3.0; //평균
			
			switch((int)(avg[i]/10)) {
			case 10:
			case 9: grade[i]="수"; break;
			case 8: grade[i]="우"; break;
			case 7: grade[i]="미"; break;
			case 6: grade[i]="양"; break;
			default: grade[i]="가";
			}	
			tot_avg=tot_avg+avg[i];
		}
		System.out.println(
				"이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<5; i++) {
		System.out.println(name[i] + "\t" + kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]) + "\t" + grade[i]);
		}
		System.out.println("학급평균:" + String.format("%.1f", tot_avg/5));
	}
}