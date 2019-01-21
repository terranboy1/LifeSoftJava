package ch17_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		//hashSet : �ߺ��� ������ �ʰ� ���ĵ� �ȵ�
		//treeSet : �ߺ��� ������ �ʰ� ���ĵ� ��(����)
		TreeSet<String> ts = new TreeSet<String>();
		
		//�Է��� ������ ��Ʈ�� ��.
		ts.add("korea");
		ts.add("japan"); 
		ts.add("america");
		ts.add("britain");
		ts.add("korea"); //�ߺ��Ǳ� ������ �ڵ� ��� �Է� �ȵ�
		
		System.out.println("<<����for������ ���>>");
		for(String str : ts) {
			System.out.println(str); //���� ������������ ���ĉѾ�~!
		}
		
		//Iterator : ���յ����͸� �ݺ�ó���ϴ� Ŭ����
		System.out.println("<<iterator�� ���>>");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
