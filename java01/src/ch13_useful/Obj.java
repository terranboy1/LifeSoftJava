package ch13_useful;

public class Obj {
	public static void main(String[] args) {
		Member m = new Member("��ö��", 190);
		System.out.println(m);
	}
}

class Member {
	String name;
	int age;
	
	public Member(String name, int age) { //��Ŭ�� source --> filed ����
		this.name = name;
		this.age = age;
	}
	
	@Override  // toStringġ�� ctrl+space ������ or ��Ŭ�� source --> toString Ŭ��
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}