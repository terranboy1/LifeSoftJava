package ch13_useful;

public class Clone implements Cloneable { //clone메서드를 사용하려면 Cloneable인터페이스를 구현해야 함
	int num=10;
	void print() {
		System.out.println(num);
	}

	//clone 치고 ctrl+space누르면 Object꺼 있음. 고거하면 자동 오버라이드~
	//지금 clone을 오버라이딩해서 고치진 않을건데 이런게 숨어있다는걸 보여주기 위해서 써본 코드임.
	@Override
	protected Object clone() throws CloneNotSupportedException { //그리고 clone메서드 쓰려면 CloneNotSupportedException 예외 처리해줘야함.
		return super.clone();
	}
	
	public static void main(String[] args) { //throws CloneNotSupportedException 해주거나 try-catch문으로 처리해주거나 둘중 하나해야함.
		Clone t1 = new Clone();
		Clone t2 = null;
		try {
			t2 = (Clone)t1.clone();  //Object클래스의 clone메서드 호출. Object메서드라 형변환 해줘야함. 우변이 계층구조상 위에 있으니까 형변환 해줘야함.
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}

}
