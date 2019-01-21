package ch17_collections;

import java.util.Vector;

public class VectorExam {

	
		/*
		 * 컬렉션(Collection) - 배열의 단점을 보완한 클래스들
		 * 배열의 단점 - 사이즈 조절 X / 삽입, 삭제 어려움 / 다양한 자료형 저장 안됨.
		 * 
		 * 컬렉션 Map계열 - 순서는 제공되지 않지만 키가 제공됨(인덱스 없고 키로 조회)
		 *      List계열 - 순서대로 저장, 키가 없음(인덱스로 조회)
		 */
	public static void main(String[] args) {
		//벡터는 거의 안쓰지만 연습차 실습을 해보기로 해용~!^^
		Vector<Object> v = new Vector<Object>(); //벡터객체 생성
		//벡터에는 다양한 자료형을 저장할 수 있음.
		//근데 이렇게 다양한 자료형을 저장하는 걸 권장하지 않는다 하네요.
		v.add("First");
		v.add(2);
		v.add('j');
		//벡터.size() 벡터요소의 갯수
		System.out.println("초기 데이터 테스트");
		for(int i=0; i<v.size(); i++) {
			System.out.println("[" + v.get(i) + "]");
		}
		//벡터의 요소 삭제
		System.out.println("1번 인덱스 삭제 후의 데이터 테스트");
		v.remove(1);
		for(int i=0; i<v.size(); i++) {
			System.out.println("[" + v.get(i) + "]");
		}
		//벡터.add(인덱스, 데이터) - 벡터에 요소 추가
		System.out.println("1번 인덱스에 요소 추가 테스트");
		v.add(1, 2);
		for(int i=0; i<v.size(); i++) {
			System.out.println("[" + v.get(i) + "]");
		}
		
	}
}
