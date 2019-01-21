package ch17_collections;

import java.util.ArrayList;
import java.util.List;
// BookŬ������ input�޼��忡 ��ĳ�� ��ü ���������� ���θ޼��尡 ���Ե� Ŭ������ ��ĳ�ʰ�ü ���� ���ص� �Ǵ±� ����

public class ListBook {
	public static void main(String[] args) {
		//ArrayList���� (���׸����� �� �̹��� BookŬ������ �ڷ����� ��ٽ��ϴ� ����آZ��~����)
		List<Book> list = new ArrayList<>();
		//ArrayList�� �ڷ� �߰�
		
		//1.�����ڸ� ������� �ʰ� ���������ϴ�.
//		Book b1 = new Book();
//		b1.setBookName("�ڹ�������");
//		b1.setPress("��������");
//		b1.setPrice(30000);
//		b1.setAmount(10);
//		b1.setMoney(b1.getPrice()*b1.getAmount()); //���� �䷡ �ϸ� �ǰٱ���~!
//		list.add(b1);
		
		//2.�����ڷ� ���������ϴ�.
//		Book b2 = new Book("jsp", "�������ǻ�", 35000, 200);
//		list.add(b2);
//		Book b3 = new Book("����Ŭ","�Ѻ����ǻ�",40000,150);
//		list.add(b3);
		
		//3.�Է¹޾� ó���غ������ϴ�.(BookŬ������ �޼��� ������� ��¨����?��)
		
		//�Է��ϴٺ��� ���� �߸� �Է��� Ȯ���� ����.
		Book b1 = new Book();
		b1.input();
		Book b2 = new Book();
		b2.input();
		Book b3 = new Book();
		b3.input();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		System.out.println("������\t���ǻ�\t�ܰ�\t����\t�Ѿ�");
		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			System.out.println(b.getBookName()+"\t"+b.getPress()+"\t"+b.getPrice()+"\t"+b.getAmount()+"\t"+b.getMoney());
		}
	}

}
