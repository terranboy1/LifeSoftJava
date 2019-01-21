//스택구조 - 나중에 입력된 것이 먼저 출력
//큐구조 - 먼저 입력된 것이 먼저 출력
package ch17_collections;

import java.util.Arrays;
import java.util.LinkedList;

//어레이리스트는 메모리에 다닥다닥 붙어있지만, 링크드리스트는 메모리상에 흩어져있다.
//노드로 연결되어 있다. 노드:데이터+주소
public class LinkedExam {
	public static void main(String[] args) {
		String[] nation = {"한국","일본","중국","미국","영국"};
		LinkedList<String> list = new LinkedList<>();
		for(String str : nation) {
			list.offer(str); //링크드리스트(큐 구조)에 자료 입력
		}
		String str = "";
		while((str = (String) list.poll()) != null) { //poll() 자료 꺼내기
			System.out.println(str + "가 삭제되었습니다.");
		}
		System.out.println(str);
	}

}
