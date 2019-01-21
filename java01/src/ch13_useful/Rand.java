package ch13_useful;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		Random r = new Random();
		//정수 범위 내에서 선택
		System.out.println(r.nextInt());
		//nextInt(n) 0 ~ n-1 범위 내에서 선택
		System.out.println(r.nextInt(100)); // 0 ~ 99
		//그럼 100~200의 범위는? nextInt(200) 아니다~
		System.out.println(r.nextInt(101)+100); // 100 ~ 200
	}

}
