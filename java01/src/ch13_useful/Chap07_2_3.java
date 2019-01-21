package ch13_useful;

import java.util.Vector;

public class Chap07_2_3 {

	public static void main(String[] args) {
		/*
			���� ������ ���� �˼� ������, �迭�� �����Ǿ��ִ�. �� �� ���̸� ���ϸ� �ٲٷ��� �迭�� ���� ����� �����ؾ� �Ѵ�.
			�̷� �� VectorŬ������ ����ϸ� �ȴ�. 
			VectorŬ������ ���������� ObjectŸ���� �迭�� ������ �־, �� �迭�� ��ü�� �߰��ϰų� ������ �� �ְ� �ۼ��Ǿ� �ִ�.
			�׸��� �迭�� ũ�⸦ �˾Ƽ� �������༭ ������ �ν��Ͻ��� ������ �Ű澲�� �ʾƵ� �ȴ�.
			public class Vector extends AbstractList implements List, Cloneable, java.io.Serializable {
				protected Object elementData[];
					...
			}
			
			Vector Ŭ������ ���� �������� ũ�Ⱑ �����Ǵ� ��ü�迭�̴�.
			
			Vector() - 10�� ��ü�� ������ �� �ִ� Vector�ν��Ͻ� ����. �ν��Ͻ��� 10���� �Ѿ�� �ڵ������� ũ�� ������.
			boolean add(Object o) - Vector�� ��ü �߰�. ���� ���� ���δ� boolean������ ��ȯ.
			boolean remove(Object o) - ��ü ����. boolean��.
			boolean isEmpty() - Vector�� ����ִ��� �˻�. ��������� true, �ƴϸ� false
			Object get(int index) - ������ ��ġ(index)�� ��ü ��ȯ. ��ȯŸ���� ObjectŸ���̹Ƿ� ������ Ÿ���� ����ȯ �ʿ�. �� �̰� ObjectŸ���̳�.
			int size() - Vector�� ����� ��ü�� ���� ��ȯ.(������)
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
			System.out.println("���� �����մϴ�~");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);   // ������ ��ǰ�� Vector�� ����
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
		
	}
	
	void refund(Product3 p) {
		if(item.remove(p)) {  //��ǰ�� Vector���� ����
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p +" ��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {  //Vector�� ����ִ��� Ȯ��
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			// get�޼��尡 ObjectŸ���̶� ProductŸ������ ����ȯ����� �Ѵ�.
			// ������ ����ȯ�ϱ� ���� instanceof�����ڷ� Ÿ��üũ�� �����������
			//���⼱ item�� ����� ��ü�� ��� ProductŬ������ �ڼ��̱� ������ instanceof�� �����ߴ�.
			//get�޼��带 ȣ���ؼ� ���� ����� ObjectŸ���� ������ ������ ProductŸ������ ����ȯ ����߸� ProductŬ������ ���ǵ� ������� price�� ������ �� �ִ�.
			Product3 p = new Product3();
			if(p instanceof Object) {
			p = (Product3) item.get(i);  //Vector�� i��°�� �ִ� ��ü�� ���´�.. �ٿ�ĳ����(ProductŸ���� ObjectŸ������ �ٲٸ�(�ڼ�->����) ������ ����ȯ������ �� �ݴ�� ����� ����ȯ.)
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
			}
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}