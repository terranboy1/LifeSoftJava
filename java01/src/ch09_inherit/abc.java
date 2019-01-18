package ch09_inherit;

public class abc {

	public static void main(String[] args) {
		
		Car a = new FireEngine();
		Car b = new Ambulance();
		Car c = new Police();
		
		a.drive();
		a.siren();
		b.drive();
		b.siren();
		c.drive();
		c.siren();
		
		Car car = new Car();
		FireEngine fe = new FireEngine();
		
		car=fe;
		fe = (FireEngine)car;  //��ĳ������ ����Ǿ�� �ٿ�ĳ������ �ȴ�.. ����� ���������� �ٽ� �ǵ������°�.
		System.out.println(fe);
	}
}

class Car {
	int a;
	
	void drive() {
		System.out.println("�����մϴ�.");
	}
	
	void siren() {
		System.out.println("�Ϲ��ڵ����� ���̷��� �����ϴ�.");
	}
}

class FireEngine extends Car {
	int b;
	
	void siren() {
		System.out.println("�ҹ��� ���̷�");
	}
}

class Ambulance extends Car {
	int c;
	
	void siren() {
		System.out.println("���深�� ���̷�");
	}
}

class Police extends Car {
	int d;
	
	void siren() {
		System.out.println("������ ���̷�");
	}
}
