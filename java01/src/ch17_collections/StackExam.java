package ch17_collections;

import java.util.Stack;

//��, ��ﳪ��! ������ LIFO - Ǫ����, ť�� FIFO - ����(offer)��(poll)~!
public class StackExam {


	public static void main(String[] args) {
		String[] nation = {"�ѱ�","�Ϻ�","�߱�","�̱�","����"};
		//���õ� �ڷ����� �������� �ʰ� ���׸����� Ÿ���� ���� �� ����.
		Stack<String> s = new Stack<String>(); //���� ��ü
		
		for(String str : nation) {
			s.push(str); //���ÿ� �ڷ��Է�
		}
		//���ÿ��� �������� �̷��� ������ ���� ���� ������ �Ʒ�ó�� while�� ������.
		/*
		System.out.println(s.pop()); //������ �ֱ� �ڷ� ����
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop()); //�� �̺κ� �ּ�ó���ص� �Ʒ� while�����п� �� pop�ǳ�.
		System.out.println(s.pop()); //�� ������.
		//System.out.println(s.pop()); ���� �� ���µ� �� �������ϴϱ� �����߻�
		*/
		//���ÿ��� �������� while���� ������ ȿ�����̴�.
		while(!s.isEmpty()) { //isEmpty�� �ƴ϶�� true (������ ������� ������ �� �����)
			System.out.println(s.pop()); //������� ������ ������.
		}
	}

}
