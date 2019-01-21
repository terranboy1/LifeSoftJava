package ch17_collections;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student st1 = new Student();
		st1.setNum("1");
		st1.setName("김석희");
		st1.setMajor("컴퓨터공학과");
		st1.setYear(2007);
		st1.setProfessor("조영태");
		list.add(st1);
		
		Student st2 = new Student("2","김학건","경영학과 ",2010,"김영아");
		list.add(st2);
		Student st3 = new Student("3","유원빈","기계공학과",2009,"유수연");
		list.add(st3);
		Student st4 = new Student("4", "정상완", "국어국문학과", 2010, "이범");
		list.add(st4);
		Student st5 = new Student("5", "김태욱", "영어영문학과", 2007, "김길수");
		list.add(st5);
		
		System.out.println("학번\t이름\t전공\t\t입학년도\t지도교수");
//		for(int i=0; i<list.size(); i++) {
//			Student st = list.get(i);
//			System.out.println(st.getNum()+"\t"+st.getName()+"\t"+st.getMajor()+"\t"+st.getYear()+"\t"+st.getProfessor());
//		}
		
		//확장된 for문으로 출력해보자~! jdk1.5부터 사용
		for(Student st : list) {
			System.out.println(st.getNum()+"\t"+st.getName()+"\t"+st.getMajor()+"\t"+st.getYear()+"\t"+st.getProfessor());
		}
	}

}
