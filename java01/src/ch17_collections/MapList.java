package ch17_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//MAP<K,V>
public class MapList {
	public static void main(String[] args) {
		//Map�� List �߰� ����
		//�ؽø� ���� Map<Key�ڷ���,Value�ڷ���>
		Map<String,Object> map = new HashMap<>();
		List<Student> list = new ArrayList<Student>();
		//ArrayList�� Student ��ü �߰�
		list.add(new Student("2017001","kim","����",2,"park"));
		list.add(new Student("2016001","park","����",3,"lee"));
		list.add(new Student("2015001","hong","����",4,"choi"));
		//�ؽøʿ� ArrayList �߰�
		map.put("list",  list);
		//map {key=value} ���� �߰�ȣ �������� ��µǰ�
		//list [value, value, value, ...] ����Ʈ�� ���ȣ�� ó���Ǿ� ��µ���.
		//toString�� �������̵����� ������ ���� ������� �ȿ� ����Ʈ ����������� ����.(�ѹ� StudentŬ������ toString�޼��� �������̵� ����� ���ड��)
		System.out.println("map���");
		System.out.println(map);
		
		//map.put(key, value) - �ʿ� �ڷ� ����
		//map.get(key) - �� �ڷ� ��ȸ
		System.out.println("map���2");
		//@SuppressWarnings("unchecked") Ÿ���� �������� �ʴٴ� ��. ��� �����ϴ� ������̼�
		List<Student> list2 = (ArrayList<Student>)map.get("list"); //map.get�� ����Ÿ���� V�ڷ���(�����̶�� ��)�̴�. �ڷ����� List<Student>�̱� ������ �����ڷ��� ������ߵǼ� (ArrayList<Student>) �̷���.
		for(Student s : list2) {
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
			System.out.println(s); //toString�������̵����� �� �� ����.
		}
	}

}

//����
//map {key=value} ���� �߰�ȣ�� ó���ǰ�
//list [value, value, value, ...] ����Ʈ�� ���ȣ�� ó������.
