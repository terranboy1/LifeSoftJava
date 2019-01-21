package ch09_inherit;

public class SingletonUse {

	public static void main(String[] args) {
		//Singleton a = new Singleton();
		//private생성자라 다음줄 에러 발생
		//생성자 대신 getInstance() method호출해 객체 생성해야 함.
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
		return "싱글튼객체(1)";
	}
}