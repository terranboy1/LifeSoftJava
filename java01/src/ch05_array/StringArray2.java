package ch05_array;

import java.util.Arrays;

public class StringArray2 {

	public static void main(String[] args) {
		
		//������ �ѱ���[�迭 ���� ��� ����ϱ�]
		String[] str = {" �ϵ� ���� ", " �̷��� ", " ��? ", " ���� "};
		
		
		
		for(int i=1; i<10; i++) {
			int n = (int)(Math.random()*str.length);	
			String tmp = str[0];
			str[0] = str[n];
			str[n] = tmp;
	
				System.out.println(Arrays.toString(str));
		}

		

	}

}
