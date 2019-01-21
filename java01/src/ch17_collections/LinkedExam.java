//���ñ��� - ���߿� �Էµ� ���� ���� ���
//ť���� - ���� �Էµ� ���� ���� ���
package ch17_collections;

import java.util.Arrays;
import java.util.LinkedList;

//��̸���Ʈ�� �޸𸮿� �ٴڴٴ� �پ�������, ��ũ�帮��Ʈ�� �޸𸮻� ������ִ�.
//���� ����Ǿ� �ִ�. ���:������+�ּ�
public class LinkedExam {
	public static void main(String[] args) {
		String[] nation = {"�ѱ�","�Ϻ�","�߱�","�̱�","����"};
		LinkedList<String> list = new LinkedList<>();
		for(String str : nation) {
			list.offer(str); //��ũ�帮��Ʈ(ť ����)�� �ڷ� �Է�
		}
		String str = "";
		while((str = (String) list.poll()) != null) { //poll() �ڷ� ������
			System.out.println(str + "�� �����Ǿ����ϴ�.");
		}
		System.out.println(str);
	}

}
