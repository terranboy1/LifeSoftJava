package ch17_collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExam {

	//ArrayList : Vector�� ������ ��������� ���� ������ �ӵ��� ����
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
	//ArrayList���� �پ��� �ڷ����� ���� ����.
	//����Ʈ.add(�߰��� ������)
		list.add("�ϳ�");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3,4);
		list.remove(1); //1���ε����� ���켼��.
		list.add(3, true); //3���ε����� true�� ��������(false ������ ���ڱ�~!)

//		list.remove(5); 5��° �ε����� ���ݾ�? IndexOutOfBoundsException �߻�.
	//����Ʈ.size() ����� ����
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("������ ��ü �׽�Ʈ ���Դϴ�.");
		list.remove(2);
		list.add(2, "��ȣ"); //2���ε��� �ڸ��� "��ȣ" �ְ� ���� �ִ� �����͸� �ڷ� �о�ֳ�.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
