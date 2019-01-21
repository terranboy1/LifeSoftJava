package ch17_collections;

import java.util.ArrayList;
import java.util.List;
// Book클래스의 input메서드에 스캐너 객체 생성있으면 메인메서드가 포함된 클래스에 스캐너객체 생성 안해도 되는군 ㄷㄷ

public class ListBook {
	public static void main(String[] args) {
		//ArrayList생성 (지네릭스로 난 이번엔 Book클래스의 자료형만 담겟습니다 얘기해줫다~ㅋㅋ)
		List<Book> list = new ArrayList<>();
		//ArrayList에 자료 추가
		
		//1.생성자를 사용하지 않고 만들어보겠읍니다.
//		Book b1 = new Book();
//		b1.setBookName("자바의정석");
//		b1.setPress("도우출판");
//		b1.setPrice(30000);
//		b1.setAmount(10);
//		b1.setMoney(b1.getPrice()*b1.getAmount()); //아하 요래 하면 되겟구나~!
//		list.add(b1);
		
		//2.생성자로 만들어보겠읍니다.
//		Book b2 = new Book("jsp", "영진출판사", 35000, 200);
//		list.add(b2);
//		Book b3 = new Book("오라클","한빛출판사",40000,150);
//		list.add(b3);
		
		//3.입력받아 처리해보겠읍니다.(Book클래스에 메서드 만들어논거 있짢어유?ㅋ)
		
		//입력하다보면 값을 잘못 입력할 확률이 있지.
		Book b1 = new Book();
		b1.input();
		Book b2 = new Book();
		b2.input();
		Book b3 = new Book();
		b3.input();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		System.out.println("도서명\t출판사\t단가\t수량\t총액");
		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			System.out.println(b.getBookName()+"\t"+b.getPress()+"\t"+b.getPrice()+"\t"+b.getAmount()+"\t"+b.getMoney());
		}
	}

}
