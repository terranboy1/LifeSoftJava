package ch13_useful;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		Random r = new Random();
		//���� ���� ������ ����
		System.out.println(r.nextInt());
		//nextInt(n) 0 ~ n-1 ���� ������ ����
		System.out.println(r.nextInt(100)); // 0 ~ 99
		//�׷� 100~200�� ������? nextInt(200) �ƴϴ�~
		System.out.println(r.nextInt(101)+100); // 100 ~ 200
	}

}
