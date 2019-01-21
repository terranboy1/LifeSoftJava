package ch17_collections;

import java.util.Scanner;

//�̷��� �����͸� ��� Ŭ������ �������� ���� �θ���.
//�ڹٺ�
//DTO(Data Transfer Object) - ������ ���� ��ü
//VO(Value Object)
//model - �����͸� ��� �׸�
public class Book {
	private String bookName; //å�̸�
	private String press; //���ǻ�
	private int price; //�ܰ�
	private int amount; //�Ǹż���
	private int money; //�Ǹűݾ�(�ܰ�x�Ǹż���)
	
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
			//next�� ������ ������ ���� ������ ���õǰ�, nextLine�� �� ������ ��°�� �Է¹޾Ƽ� ����ڵ� �� ��µǾ��,.
			System.out.println("�������� �Է����ּ���.");
			bookName = scan.nextLine();
			System.out.println("���ǻ�");
			press = scan.nextLine();
			System.out.println("�ܰ�");
			price = scan.nextInt();
			if(price<=0 || 100000<=price)
				throw new Exception();
			/*�̰� ���� ������ȿ���˻縦 �־�ô�.
			while(true){
				System.out.println("�ܰ�"); //�ܰ��� ���� �־��� �� ��� ó���Ұǵ�?�ڡ�
				price = scan.nextInt();
				if(price<=0 || 100000<price) {
					System.out.println("��ȿ�� ���� �Է����ּ���.");
					continue;
				}
				break;
			}
			*/
			System.out.println("����");
			amount = scan.nextInt();
			//�ݾ�=�ܰ�*����
			money = price * amount;
		} catch(Exception e) {
			System.out.println("��ȿ�� ���� �Է����ּ���.(ó������ ���ư��ϴ�.)");
		}
		//scan.close(); ��ĳ�ʴ� ���� close����ߵǴµ� �� ���α׷����� Ŭ�����ϸ� �������ٰ��ϳ׿�? �� �׷���? ��ĳ�ʴ� �ϳ��Է��ϰ� �ݰ� �ϳ��Է��ϰ� �ݰ� �̷��� �浹�� ���ٰ���. �Է��� �����ϰ� ���� ������ �ݾ���� �ȴٰ� ��.
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
