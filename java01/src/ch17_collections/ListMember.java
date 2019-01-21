package ch17_collections;

import java.util.ArrayList;
import java.util.List;

public class ListMember {

	public static void main(String[] args) {
		//리스트 객체 생성
		ArrayList<Member> list = new ArrayList<Member>();
		//List<Member> list = new ArrayList<>(); 다형성이네? 실무에서 많이 쓰는 코드입니다. ArrayList, LinkedList 한번에 다 다룰 수 있다는데 좀더 봐야알듯?
		//멤버 객체  5건 만들고 자료 입력
		Member m1 = new Member(); //생성자로 변경
		m1.setName("김기수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-999-8888");
		m1.setEmail("kim@naver.com");
		
		Member m2 = new Member();
		m2.setName("홍길동");
		m2.setUserid("hong");
		m2.setPasswd("2222");
		m2.setTel("02-988-5555");
		m2.setEmail("hong@daum.net");
		
		Member m3 = new Member();
		m3.setName("김석희");
		m3.setUserid("terr");
		m3.setPasswd("1111");
		m3.setTel("02-839-8177");
		m3.setEmail("terranboy@naver.com");
		
		Member m4 = new Member();
		m4.setName("최원종");
		m4.setUserid("gmldi");
		m4.setPasswd("qwwe");
		m4.setTel("02-822-8177");
		m4.setEmail("gmldi@naver.com");
	
		Member m5 = new Member();
		m5.setName("권영후");
		m5.setUserid("hooya");
		m5.setPasswd("dudgn");
		m5.setTel("02-813-4256");
		m5.setEmail("hooya116@naver.com");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		System.out.println("출력값이 어떻게 될까용~?");
		System.out.println("1번출력 방법");
		System.out.println("이름\t아이디\t비번\t전화번호\t\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i);
			System.out.println((m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail()+"\t"));
		}
		
//		System.out.println("2번출력 방법");
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}

}