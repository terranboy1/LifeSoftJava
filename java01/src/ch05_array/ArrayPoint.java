package ch05_array;

import java.util.Scanner;

public class ArrayPoint {
	public static void main(String[] args) {
		String[] name= {"��ö��", "�̼���", "���μ�", "����ȣ", "�̼���"};
		int[] kor = {100, 80, 70, 60, 90};
		int[] eng = {80, 90, 95, 85, 75};
		int[] mat = {99, 89, 79, 69, 77};
		//int[] tot=new int[5];
		int[] tot = {0, 0, 0, 0, 0};
		double[] avg=new double[5];
		String[] grade=new String[5];  //��� �迭
		double tot_avg=0; //�б� ���
		for(int i=0; i<5; i++) {
			tot[i]=kor[i]+eng[i]+mat[i]; //����
			avg[i]=tot[i] / 3.0; //���
			
			switch((int)(avg[i]/10)) {
			case 10:
			case 9: grade[i]="��"; break;
			case 8: grade[i]="��"; break;
			case 7: grade[i]="��"; break;
			case 6: grade[i]="��"; break;
			default: grade[i]="��";
			}	
			tot_avg=tot_avg+avg[i];
		}
		System.out.println(
				"�̸�\t����\t����\t����\t����\t���\t���");
		for(int i=0; i<5; i++) {
		System.out.println(name[i] + "\t" + kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]) + "\t" + grade[i]);
		}
		System.out.println("�б����:" + String.format("%.1f", tot_avg/5));
	}
}