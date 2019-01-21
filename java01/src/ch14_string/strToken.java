package ch14_string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class strToken {

	public static void main(String[] args) {
		
		//���ڿ��� �ش� ���� �������� �ɰ��� ��� 2����
		//StringŬ������ split() and StringTokenizerŬ����
		
		String str = "apple/banana/grape/melon";
		String[] items = str.split("/"); //split�޼���. �����ڸ� �������� ���ڿ��� ��������. �迭�� ó��.
		for(String s : items) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(items)); //�����ڸ� �������� �迭�� ����!\
		
		String str1 = "�輮��,�ǿ���,�ֿ���,��뼷,������,��뿵";
		String[] str2= str1.split(",");
		System.out.println(Arrays.toString(str2));
		
		//StringTokenizer : ��Ʈ�� ������
		//token : ���ӵ� ���ڿ��� ������ �� �ִ� ����
		System.out.println("StringTokenizer �����Դϴ�.");
		//StringTokenizer�� ���ڿ��� �ɰ��� �ϴµ� �迭�� ������ �ʴ´�.
		StringTokenizer st = new StringTokenizer(str,"/");
		int cnt = st.countTokens();
		System.out.println("��ū�� ����:"+cnt);
		while(st.hasMoreElements()) { //���� ��Ұ� ������  true, ������ false
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(str1, ",");
		int cnt2 = st2.countTokens();
		System.out.println("cnt2 = " + cnt2);
		while(st2.hasMoreElements()) {
			System.out.println(st2.nextToken());
		}
	}

}
