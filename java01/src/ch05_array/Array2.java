package ch05_array;

public class Array2 {

	public static void main(String[] args) {
		int[][] num = {{10,20,30},{40,50,60},{70,80,90}};
		//위의 간단한 한줄이 사실 아래라능..
//		num = new int[3][3];
//		num[0][0]=10;  0행0열
//		num[0][1]=20;  0행1열
//		num[0][2]=30;  0행2열
//		num[1][0]=40;  1행0열
//		num[1][1]=50;  1행1열
//		num[1][2]=60;  1행2열
//		num[2][0]=70;  2행0열
//		num[2][1]=80;  2행1열
//		num[2][2]=90;  2행2열
		
//		int[][] num = {      //이렇게 예쁘게 배치도 가능
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//				};
		
		for(int i=0; i<3; i++) {     //행
			System.out.print("{");
			for(int j=0; j<3; j++) { //열
				System.out.printf("%d,",num[i][j]);
			}
			System.out.print("}");
			System.out.println();
			
			//2차원 배열도 메모리에 순차적으로 쌓임. 
		}
	}

}
