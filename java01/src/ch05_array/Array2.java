package ch05_array;

public class Array2 {

	public static void main(String[] args) {
		int[][] num = {{10,20,30},{40,50,60},{70,80,90}};
		//���� ������ ������ ��� �Ʒ����..
//		num = new int[3][3];
//		num[0][0]=10;  0��0��
//		num[0][1]=20;  0��1��
//		num[0][2]=30;  0��2��
//		num[1][0]=40;  1��0��
//		num[1][1]=50;  1��1��
//		num[1][2]=60;  1��2��
//		num[2][0]=70;  2��0��
//		num[2][1]=80;  2��1��
//		num[2][2]=90;  2��2��
		
//		int[][] num = {      //�̷��� ���ڰ� ��ġ�� ����
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//				};
		
		for(int i=0; i<3; i++) {     //��
			System.out.print("{");
			for(int j=0; j<3; j++) { //��
				System.out.printf("%d,",num[i][j]);
			}
			System.out.print("}");
			System.out.println();
			
			//2���� �迭�� �޸𸮿� ���������� ����. 
		}
	}

}
