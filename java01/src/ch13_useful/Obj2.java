package ch13_useful;

public class Obj2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		Parent p1 = new Child();
		Child c1 = (Child) new Parent();  //!!!
		
		Parent p2 = new Parent();
		Child c2 = new Child();
		
		c2 = (Child) p2;
	}
}

class Parent {
	int x;
	int y;
	
	void a() {
		System.out.println("아빠");
	}
}

class Child extends Parent{
	int z;
	
	void b() {
		System.out.println("아들");
	}
}