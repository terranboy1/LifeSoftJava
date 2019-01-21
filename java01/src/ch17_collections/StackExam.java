package ch17_collections;

import java.util.Stack;

//마, 기억나노! 스택은 LIFO - 푸시팝, 큐는 FIFO - 오퍼(offer)폴(poll)~!
public class StackExam {


	public static void main(String[] args) {
		String[] nation = {"한국","일본","중국","미국","영국"};
		//스택도 자료형을 고정하지 않고 지네릭으로 타입을 정할 수 있지.
		Stack<String> s = new Stack<String>(); //스택 객체
		
		for(String str : nation) {
			s.push(str); //스택에 자료입력
		}
		//스택에서 꺼내려면 이렇게 일일이 꺼낼 수도 있지만 아래처럼 while문 돌리자.
		/*
		System.out.println(s.pop()); //스택의 최근 자료 추출
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop()); //오 이부분 주석처리해도 아래 while문덕분에 다 pop되네.
		System.out.println(s.pop()); //다 꺼냇다.
		//System.out.println(s.pop()); 꺼낼 게 없는데 또 꺼내려하니까 에러발생
		*/
		//스택에서 꺼내려면 while문을 돌리면 효율적이다.
		while(!s.isEmpty()) { //isEmpty가 아니라면 true (스택이 비어있지 않으면 다 끄집어냄)
			System.out.println(s.pop()); //비어있지 않으면 꺼낸다.
		}
	}

}
