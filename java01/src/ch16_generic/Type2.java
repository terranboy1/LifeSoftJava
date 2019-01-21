package ch16_generic;

public class Type2 {
	//하는 일은 같은데 자료형이 다르다면? Object로 선언할 수 있다. 근데 매 연산마다 형변환 발생하지.
	Object value;
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		Object obj = t.getValue();
		System.out.println(t.getValue());
		t.setValue(100);
		obj=t.getValue(); //형변환
		System.out.println(obj);

	}

	public Object getValue() {
		return value; //어떤 자료형이 리턴될지 모름
	}

	public void setValue(Object value) { //어떤 자료형이 입력될지 모름. 형변환해야됨.
		this.value = value; 
	}

	
}
