package ch17_collections;

import java.util.Vector;

public class VectorExam {

	
		/*
		 * �÷���(Collection) - �迭�� ������ ������ Ŭ������
		 * �迭�� ���� - ������ ���� X / ����, ���� ����� / �پ��� �ڷ��� ���� �ȵ�.
		 * 
		 * �÷��� Map�迭 - ������ �������� ������ Ű�� ������(�ε��� ���� Ű�� ��ȸ)
		 *      List�迭 - ������� ����, Ű�� ����(�ε����� ��ȸ)
		 */
	public static void main(String[] args) {
		//���ʹ� ���� �Ⱦ����� ������ �ǽ��� �غ���� �ؿ�~!^^
		Vector<Object> v = new Vector<Object>(); //���Ͱ�ü ����
		//���Ϳ��� �پ��� �ڷ����� ������ �� ����.
		//�ٵ� �̷��� �پ��� �ڷ����� �����ϴ� �� �������� �ʴ´� �ϳ׿�.
		v.add("First");
		v.add(2);
		v.add('j');
		//����.size() ���Ϳ���� ����
		System.out.println("�ʱ� ������ �׽�Ʈ");
		for(int i=0; i<v.size(); i++) {
			System.out.println("[" + v.get(i) + "]");
		}
		//������ ��� ����
		System.out.println("1�� �ε��� ���� ���� ������ �׽�Ʈ");
		v.remove(1);
		for(int i=0; i<v.size(); i++) {
			System.out.println("[" + v.get(i) + "]");
		}
		//����.add(�ε���, ������) - ���Ϳ� ��� �߰�
		System.out.println("1�� �ε����� ��� �߰� �׽�Ʈ");
		v.add(1, 2);
		for(int i=0; i<v.size(); i++) {
			System.out.println("[" + v.get(i) + "]");
		}
		
	}
}
