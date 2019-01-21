package ch17_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapExam {

	public static void main(String[] args) {
		//보통 맵은 HashMap<String,Object> map =- new HashMap<>(); 형식으로 많이 쓴다.
		//key값은 데이터를 빨리 찾기 위해 물어보는거고, 값은 모든 값을 집어넣는 Object타입을 많이 씀.
		//map.put("kim","김철수"); // put(key, value)
		//map.put("park","박민호");
		//map.get("kim"); // key가 "kim"인 값 "김철수" 를 찾는다.
		
		//풀어서 입력할 것(반복문 사용 X)
		String[] nation = {"한국", "일본", "중국", "미국", "태국", "영국"};
		String[] city = {"서울","동경","북경","워싱턴","방콕","런던"};
		
		//해시맵 HashMap<Key자료형,Value자료형>
		//사전을 예로 들면 단어:key / 설명:value
		//HashpMap key로 Integer주면 리스트랑 다를 게 없어서(숫자 인덱스밖에 안되니까. 맵은 문자 인덱스여야 의미가 있는거지) 보통 String.
		//HashMap<String, String> map = new HashMap<String, String>();
		//HashpMap은 Map인터페이스를 구현한다. 고로 다형성을 적용한 아래코드가 된다.
		Map<String, Object> map = new HashMap<>();
		//맵 - index대신 key(변수명)가 제공됨
		for(int i=0; i<city.length; i++) {
			//map에 자료 입력: map객체.put(key,value) 변수명, 값
			//원래는 아래처럼 데이터를 입력해야되는데 
			//map.put("한국","서울");
			//map.put("일본","동경");
			//for문을 이용해 일괄로 처리. for문 돌리는게 편하네.
			map.put(nation[i], city[i]);
		}
		
		//맵에 저장된 자료 조회 map객체.get(key);
		System.out.println("<<<맵에 저장된 자료 조회>>>");
		//map을 출력하면 map {key=value, key=value, ...} 형식으로 출력되는군.
		System.out.println(map); //오 배열이 일괄로 출력되는군. 순서는 꼬이네. 맵은 순서대로 저장되는 게 아님. 순서가 유지되는 것은 list. 순서는 없으나 key를 이용해 빨리 찾을 수 있음.
		System.out.println(map.get("한국"));
		
		//keySet()은 key집합을 return함.
		System.out.println("key값만 뽑아보자. keySet()");
		System.out.println(map.keySet()); //key집합.
		System.out.println("value값만 뽑아보자. values()");
		System.out.println(map.values()); //value집합.
		
		//입력한 순서대로 저장되지 않는다.
		System.out.println("<<<Iterator 활용>>>");
		Iterator<String> iterator = map.keySet().iterator();  
		while(iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println("key=" + key);
			System.out.println("value=" + map.get(key));
		}
		
		//map.get(key) : 맵에 저장된 값 조회
		System.out.println("<<<전체값 조회>>>");
		for(int i=0; i<city.length; i++) {
			System.out.println(map.get(nation[i]));
		}
		//단일값 조회
		Scanner scan = new Scanner(System.in);
		System.out.print("나라 이름을 입력하세요. : ");
		String str = scan.next();
		System.out.println(str+ "의 수도는?" + map.get(str));
		
		//단일값조회 응용
		//퀴즈 만들어보자. 한국의수도는? 서울. ㅁㅁ의 수도는? ㅁㅁ 이렇게 나오게.
		
		//참, map 출력할 때 향상된 for문 사용 못함.
		//for(String str : map) {} 이거 불가능. 숫자인덱스로 검색하는 게 아니라서 안됨.(일반 for문은 되고)
		
	}
}
