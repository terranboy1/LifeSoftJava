package ch17_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		//hashSet : 중복이 허용되지 않고 정렬도 안됨
		//treeSet : 중복이 허용되지 않고 정렬도 됨(오오)
		TreeSet<String> ts = new TreeSet<String>();
		
		//입력할 때마다 소트가 됨.
		ts.add("korea");
		ts.add("japan"); 
		ts.add("america");
		ts.add("britain");
		ts.add("korea"); //중복되기 때문에 코드 적어도 입력 안됨
		
		System.out.println("<<향상된for문으로 출력>>");
		for(String str : ts) {
			System.out.println(str); //오오 오름차순으로 정렬됏언~!
		}
		
		//Iterator : 집합데이터를 반복처리하는 클래스
		System.out.println("<<iterator로 출력>>");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
