package ch17_collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExam {

	public static void main(String[] args) {
		//set은 순서 없고, 중복값을 허용하지 않음
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea"); //중복되기 때문에 코드 적어도 입력 안됨
		
		System.out.println("<<향상된for문으로 출력>>");
		for(String str : hs) {
			System.out.println(str); //출력값 잘 보면 순서 유지 안됨★
		}
		
		//Iterator : 집합데이터를 반복처리하는 클래스
		System.out.println("<<iterator로 출력>>");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
