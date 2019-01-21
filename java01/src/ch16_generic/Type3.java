package ch16_generic;

//Type3<T> : 자료형이 미정인 상태
//컴파일할 때는 미정이고 실행할 때 결정됨.
//하나의 클래스로 다양한 자료형을 처리(제네릭, 일반화)(안그러면 자료형마다 클래스 만들어야 하니까)
public class Type3<T> {  //클래스를 한 개 만들었지만, 여러 개 클래스를 만든 효과(만약에 Object를 쓰지 않는 경우엔 자료형마다 다르게 처리를 해줘야한다. 클래스를 새로 만들거나, 메서드 오버로딩 일일이 해야하거든. 그렇다고 Object쓰기엔 너무 비효율)
	T value;
	public void setValue(T value) {
		this.value= value;
	}
	public T getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Type3<String> t = new Type3<String>(); //컴파일할 때 자료형을 고정시킴. 이렇게 < >안에 타입을 결정하면 위의 <T>가 String으로 바뀌게 됨. 즉, String자료형이 <T>에 전달되는 것.
	//  Type3<String> t = new Type3<>(); //참조변수 선언할 때 자료형 썼으면 오른쪽엔 생략 가능하지만 가독성을 위해!!
		t.setValue("300");
		System.out.println("지네릭스 타입 String --> " + t.getValue());
		//t.setT(500); //에러(지정된 자료형만 입력 가능. 여기선 String자료형으로 정해졌으니깐.)
		
	// 근데 이렇게 타입을 실행시에 지정했는데, 내가 다양한 자료형을 쓰고싶다? 그래서 아래와같이 썼따?
	// Type3<Object> t = new Type3<Object>(); 이러면 Typ2.java 예제에서 멤버변수 자료형을 Object로 하는 것과 다를 바가 없어짐.(경우에 따라서 이렇게 쓸 떄도 있다고 한다.)
	}
}

// 이렇게 무슨 자료형이 들어올 지 모를 때
// Object를 만들어서 처리할 순 있지만 매번 형변환을 해줘야해서 무겁고 비효율적이다.
// 지네릭스는 템플릿 같은 역할을 한다. 
// 지네릭스를 쓰면 객체를 만들 때 명시한 타입(위의 예제에선 String)으로 입력된다.
// 모든 자료형을 일반화 한 것, 그것이 바로 지네릭이다.(존나멋있어)