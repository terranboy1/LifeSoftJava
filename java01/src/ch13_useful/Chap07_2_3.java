package ch13_useful;

import java.util.Vector;

public class Chap07_2_3 {

	public static void main(String[] args) {
		/*
			이전 예제를 보면 알수 있지만, 배열은 고정되어있다. 한 번 길이를 정하면 바꾸려면 배열을 새로 만들고 복사해야 한다.
			이럴 때 Vector클래스를 사용하면 된다. 
			Vector클래스는 내부적으로 Object타입의 배열을 가지고 있어서, 이 배열에 객체를 추가하거나 제거할 수 있게 작성되어 있다.
			그리고 배열의 크기를 알아서 관리해줘서 저장할 인스턴스의 개수에 신경쓰지 않아도 된다.
			public class Vector extends AbstractList implements List, Cloneable, java.io.Serializable {
				protected Object elementData[];
					...
			}
			
			Vector 클래스는 단지 동적으로 크기가 관리되는 객체배열이다.
			
			Vector() - 10개 객체를 저장할 수 있는 Vector인스턴스 생성. 인스턴스가 10개가 넘어가면 자동적으로 크기 증가됨.
			boolean add(Object o) - Vector에 객체 추가. 성공 실패 여부는 boolean값으로 반환.
			boolean remove(Object o) - 객체 제거. boolean값.
			boolean isEmpty() - Vector가 비어있는지 검사. 비어있으면 true, 아니면 false
			Object get(int index) - 지정된 위치(index)의 객체 반환. 반환타입이 Object타입이므로 적절한 타입의 형변환 필요. 아 이거 Object타입이네.
			int size() - Vector에 저장된 객체의 개수 반환.(정수형)
		*/
		
		Buyer3 b = new Buyer3();
		Tv3 tv = new Tv3();
		Computer3 com = new Computer3();
		Audio3 audio = new Audio3();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		b.refund(com);
		b.refund(com);
		b.summary();
	}
}

class Product3 {
	int price;
	int bonusPoint;
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product3() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv3 extends Product3 {
	Tv3() { super(100); }
	
	public String toString() {
		return "TV";
	}
}

class Computer3 extends Product3 {
	Computer3() { super(200); }
	
	public String toString() {
		return "Computer";
	}
}

class Audio3 extends Product3 {
	Audio3() { super(50); }
	
	public String toString() {
		return "Audio";
	}
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	
	Vector item = new Vector();
	
	void buy(Product3 p) {
		if(money<p.price) {
			System.out.println("돈이 부족합니다~");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);   // 구입한 제품을 Vector에 저장
		System.out.println(p+"를 구입하셨습니다.");
		
	}
	
	void refund(Product3 p) {
		if(item.remove(p)) {  //제품을 Vector에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p +" 을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {  //Vector가 비어있는지 확인
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			// get메서드가 Object타입이라 Product타입으로 형변환해줘야 한다.
			// 원래는 형변환하기 전에 instanceof연산자로 타입체크를 해줘야하지만
			//여기선 item에 저장된 객체가 모두 Product클래스의 자손이기 때문에 instanceof를 생략했다.
			//get메서드를 호출해서 얻은 결과가 Object타입의 참조기 때문에 Product타입으로 형변환 해줘야만 Product클래스에 정의된 멤버변수 price에 접근할 수 있다.
			Product3 p = new Product3();
			if(p instanceof Object) {
			p = (Product3) item.get(i);  //Vector의 i번째에 있는 객체를 얻어온다.. 다운캐스팅(Product타입을 Object타입으로 바꾸면(자손->조상) 묵시적 형변환이지만 그 반대는 명시적 형변환.)
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
			}
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}