package ch17_collections;

import java.util.Scanner;

//이렇게 데이터를 담는 클래스를 여러가지 용어로 부른다.
//자바빈
//DTO(Data Transfer Object) - 데이터 전달 객체
//VO(Value Object)
//model - 데이터를 담는 그릇
public class Book {
	private String bookName; //책이름
	private String press; //출판사
	private int price; //단가
	private int amount; //판매수량
	private int money; //판매금액(단가x판매수량)
	
	public Book() {}

	public Book(String bookName, String press, int price, int amount) {
		this.bookName = bookName;
		this.press = press;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		try {
			//next는 공백을 만나면 이후 내용이 무시되고, nextLine은 한 라인을 통째로 입력받아서 공백뒤도 다 출력되어요,.
			System.out.println("도서명을 입력해주세요.");
			bookName = scan.nextLine();
			System.out.println("출판사");
			press = scan.nextLine();
			System.out.println("단가");
			price = scan.nextInt();
			if(price<=0 || 100000<=price)
				throw new Exception();
			/*이건 내가 가격유효성검사를 넣어봤다.
			while(true){
				System.out.println("단가"); //단가에 음수 넣었을 때 어떻게 처리할건데?★★
				price = scan.nextInt();
				if(price<=0 || 100000<price) {
					System.out.println("유효한 값을 입력해주세요.");
					continue;
				}
				break;
			}
			*/
			System.out.println("수량");
			amount = scan.nextInt();
			//금액=단가*수량
			money = price * amount;
		} catch(Exception e) {
			System.out.println("유효한 값을 입력해주세요.(처음으로 돌아갑니다.)");
		}
		//scan.close(); 스캐너는 원래 close해줘야되는데 이 프로그램에서 클로즈하면 에러난다고하네요? 왜 그럴까? 스캐너는 하나입력하고 닫고 하나입력하고 닫고 이러면 충돌이 난다고함. 입력이 완전하게 끝난 다음에 닫아줘야 된다고 함.
	}
	
	public void calc() {
		money = amount * price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
