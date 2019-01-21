package ch17_collections;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student st1 = new Student();
		st1.setNum("1");
		st1.setName("�輮��");
		st1.setMajor("��ǻ�Ͱ��а�");
		st1.setYear(2007);
		st1.setProfessor("������");
		list.add(st1);
		
		Student st2 = new Student("2","���а�","�濵�а� ",2010,"�迵��");
		list.add(st2);
		Student st3 = new Student("3","������","�����а�",2009,"������");
		list.add(st3);
		Student st4 = new Student("4", "�����", "������а�", 2010, "�̹�");
		list.add(st4);
		Student st5 = new Student("5", "���¿�", "������а�", 2007, "����");
		list.add(st5);
		
		System.out.println("�й�\t�̸�\t����\t\t���г⵵\t��������");
//		for(int i=0; i<list.size(); i++) {
//			Student st = list.get(i);
//			System.out.println(st.getNum()+"\t"+st.getName()+"\t"+st.getMajor()+"\t"+st.getYear()+"\t"+st.getProfessor());
//		}
		
		//Ȯ��� for������ ����غ���~! jdk1.5���� ���
		for(Student st : list) {
			System.out.println(st.getNum()+"\t"+st.getName()+"\t"+st.getMajor()+"\t"+st.getYear()+"\t"+st.getProfessor());
		}
	}

}
