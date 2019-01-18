package ch05_array;

public class Array2Point {

	public static void main(String[] args) {
		//±¹¾î,¿µ¾î,¼öÇÐ,ÃÑÁ¡,Æò±Õ
		int[][] point = {
				{80,90,100,0,0},
				{70,60,95,0,0},
				{88,77,66,0,0},
				{99,89,95,0,0},
				{100,60,50,0,0}
		};
		
		for(int i=0; i<5; i++) {
			point[i][3] = point[i][0] + point[i][1] + point[i][2]; //ÃÑÁ¡
			point[i][4] = point[i][3] / 3; //Æò±Õ
		}
		
		//°á°ú Ãâ·Â
		System.out.println("±¹¾î\t¿µ¾î\t¼öÇÐ\tÃÑÁ¡\tÆò±Õ");
		for(int i=0; i<5; i++) {
			System.out.println(point[i][0] + "\t" + point[i][1] + "\t" + point[i][2] + "\t" + point[i][3] + "\t" + point[i][4]);
		}		
	}
}
