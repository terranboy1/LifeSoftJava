package ch17_collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExam {

	public static void main(String[] args) {
		//set�� ���� ����, �ߺ����� ������� ����
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea"); //�ߺ��Ǳ� ������ �ڵ� ��� �Է� �ȵ�
		
		System.out.println("<<����for������ ���>>");
		for(String str : hs) {
			System.out.println(str); //��°� �� ���� ���� ���� �ȵʡ�
		}
		
		//Iterator : ���յ����͸� �ݺ�ó���ϴ� Ŭ����
		System.out.println("<<iterator�� ���>>");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
