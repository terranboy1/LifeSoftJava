package ch17_collections;

import java.util.ArrayList;
import java.util.List;

public class ListMember {

	public static void main(String[] args) {
		//����Ʈ ��ü ����
		ArrayList<Member> list = new ArrayList<Member>();
		//List<Member> list = new ArrayList<>(); �������̳�? �ǹ����� ���� ���� �ڵ��Դϴ�. ArrayList, LinkedList �ѹ��� �� �ٷ� �� �ִٴµ� ���� ���߾˵�?
		//��� ��ü  5�� ����� �ڷ� �Է�
		Member m1 = new Member(); //�����ڷ� ����
		m1.setName("����");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-999-8888");
		m1.setEmail("kim@naver.com");
		
		Member m2 = new Member();
		m2.setName("ȫ�浿");
		m2.setUserid("hong");
		m2.setPasswd("2222");
		m2.setTel("02-988-5555");
		m2.setEmail("hong@daum.net");
		
		Member m3 = new Member();
		m3.setName("�輮��");
		m3.setUserid("terr");
		m3.setPasswd("1111");
		m3.setTel("02-839-8177");
		m3.setEmail("terranboy@naver.com");
		
		Member m4 = new Member();
		m4.setName("�ֿ���");
		m4.setUserid("gmldi");
		m4.setPasswd("qwwe");
		m4.setTel("02-822-8177");
		m4.setEmail("gmldi@naver.com");
	
		Member m5 = new Member();
		m5.setName("�ǿ���");
		m5.setUserid("hooya");
		m5.setPasswd("dudgn");
		m5.setTel("02-813-4256");
		m5.setEmail("hooya116@naver.com");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		System.out.println("��°��� ��� �ɱ��~?");
		System.out.println("1����� ���");
		System.out.println("�̸�\t���̵�\t���\t��ȭ��ȣ\t\t�̸���");
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i);
			System.out.println((m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail()+"\t"));
		}
		
//		System.out.println("2����� ���");
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}

}