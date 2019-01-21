package ch17_collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExam {

	//ArrayList : Vector와 사용법이 비슷하지만 좀더 가볍고 속도가 빠름
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
	//ArrayList에는 다양한 자료형을 저장 가능.
	//리스트.add(추가할 데이터)
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3,4);
		list.remove(1); //1번인덱스를 지우세용.
		list.add(3, true); //3번인덱스에 true를 넣으세용(false 다음에 오겠군~!)

//		list.remove(5); 5번째 인덱스는 없잖아? IndexOutOfBoundsException 발생.
	//리스트.size() 요소의 갯수
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("데이터 교체 테스트 중입니다.");
		list.remove(2);
		list.add(2, "야호"); //2번인덱스 자리에 "야호" 넣고 원래 있던 데이터를 뒤로 밀어넣네.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
