package ch05_array;

public class IntArray {

	public static void main(String[] args) {
//		int[] num;      //배열참조변수 선언
//		// new 자료형 => 동적 메모리 할당.
//		num=new int[5];  //배열이 생성되고 참조변수에 연결
//		//배열참조변수[인덱스]
//		num[0]=10;  //참조변수가 가리키는 첫번째 요소
//		num[1]=20;
//		num[2]=30;                  //이렇게 한 게 18번째 줄이랑 같음. 이렇게 일일이 채우는 법도 기억하시고.
//		num[3]=40;
//		num[4]=50;    
//		num[5]=60;  //ArrayIndexOutOfBoundsException. 컴파일은 됐지만 런타임 에러가 생겨부러. 배열범위 초과.
		
//		int[] num;
//		num = new int[] {10,20,30,40,50};  이게 아래 한줄과 같음.
		
		int[] num = {10,20,30,40,50};  // 요게 젤 많이 쓰는 방식이지.
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
				
		//향상된 for문
		for(int tmp : num) {
			System.out.println(tmp);
		}
	}

}
