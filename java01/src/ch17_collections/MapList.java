package ch17_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//MAP<K,V>
public class MapList {
	public static void main(String[] args) {
		//Map에 List 추가 예제
		//해시맵 생성 Map<Key자료형,Value자료형>
		Map<String,Object> map = new HashMap<>();
		List<Student> list = new ArrayList<Student>();
		//ArrayList에 Student 객체 추가
		list.add(new Student("2017001","kim","국사",2,"park"));
		list.add(new Student("2016001","park","국문",3,"lee"));
		list.add(new Student("2015001","hong","영문",4,"choi"));
		//해시맵에 ArrayList 추가
		map.put("list",  list);
		//map {key=value} 맵은 중괄호 형식으로 출력되고
		//list [value, value, value, ...] 리스트는 대괄호로 처리되어 출력되지.
		//toString을 오버라이딩하지 않으면 맵의 출력형식 안에 리스트 출력형식으로 나옴.(한번 Student클래스의 toString메서드 오버라이딩 지우고 실행ㄱㄱ)
		System.out.println("map출력");
		System.out.println(map);
		
		//map.put(key, value) - 맵에 자료 저장
		//map.get(key) - 맵 자료 조회
		System.out.println("map출력2");
		//@SuppressWarnings("unchecked") 타입이 안전하지 않다는 뜻. 경고를 무시하는 어노테이션
		List<Student> list2 = (ArrayList<Student>)map.get("list"); //map.get의 리턴타입이 V자료형(미정이라는 뜻)이다. 자료형이 List<Student>이기 때문에 리턴자료형 맞춰줘야되서 (ArrayList<Student>) 이렇게.
		for(Student s : list2) {
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
			System.out.println(s); //toString오버라이딩했을 시 잘 나옴.
		}
	}

}

//참고
//map {key=value} 맵은 중괄호로 처리되고
//list [value, value, value, ...] 리스트는 대괄호로 처리되지.
