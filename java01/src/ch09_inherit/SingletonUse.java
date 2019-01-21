package ch09_inherit;

public class SingletonUse {

	public static void main(String[] args) {
		//Singleton a = new Singleton();
		//private�����ڶ� ������ ���� �߻�
		//������ ��� getInstance() methodȣ���� ��ü �����ؾ� ��.
		Singleton a = Singleton.getInsance();
		Singleton b = Singleton.getInsance();
		Singleton c = Singleton.getInsance();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}

class Singleton {
	private static Singleton instance;
	public static Singleton getInsance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}	
	public String toString() {
		return "�̱�ư��ü(1)";
	}
}