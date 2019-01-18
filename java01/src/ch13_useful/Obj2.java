package ch13_useful;

public class Obj2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		Parent p1 = new Child();
		Child c1 = (Child) new Parent();  //!!!
	}
}

class Parent {
	int x;
	int y;
}

class Child extends Parent{
	int z;
}