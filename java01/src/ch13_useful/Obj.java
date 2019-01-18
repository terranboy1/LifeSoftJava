package ch13_useful;

public class Obj {
	public static void main(String[] args) {
		Member m = new Member("김철수", 190);
		System.out.println(m);
	}
}

class Member {
	String name;
	int age;
	
	public Member(String name, int age) { //우클릭 source --> filed 생성
		this.name = name;
		this.age = age;
	}
	
	@Override  // toString치고 ctrl+space 누르기 or 우클릭 source --> toString 클릭
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}
