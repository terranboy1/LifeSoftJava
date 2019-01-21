package ch14_string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class strToken {

	public static void main(String[] args) {
		
		//문자열을 해당 단위 기준으로 쪼개는 방식 2가지
		//String클래스의 split() and StringTokenizer클래스
		
		String str = "apple/banana/grape/melon";
		String[] items = str.split("/"); //split메서드. 구분자를 기준으로 문자열이 나뉘어짐. 배열로 처리.
		for(String s : items) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(items)); //구분자를 기준으로 배열에 담겼다!\
		
		String str1 = "김석희,권영후,최원종,장용섭,이현준,김대영";
		String[] str2= str1.split(",");
		System.out.println(Arrays.toString(str2));
		
		//StringTokenizer : 스트링 구분자
		//token : 연속된 문자에서 구별할 수 있는 단위
		System.out.println("StringTokenizer 예제입니다.");
		//StringTokenizer는 문자열을 쪼개긴 하는데 배열로 만들진 않는다.
		StringTokenizer st = new StringTokenizer(str,"/");
		int cnt = st.countTokens();
		System.out.println("토큰의 갯수:"+cnt);
		while(st.hasMoreElements()) { //다음 요소가 있으면  true, 없으면 false
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(str1, ",");
		int cnt2 = st2.countTokens();
		System.out.println("cnt2 = " + cnt2);
		while(st2.hasMoreElements()) {
			System.out.println(st2.nextToken());
		}
	}

}
