package ch11_abstract;

import java.awt.Color;
import java.awt.Graphics;

public class DrawCircle extends Point implements Draw {
	private int width, height;
	
	public DrawCircle() {
		this(0,0,0,0);
	}
	
	public DrawCircle(int a, int b, int w,int h) {
		super(a,b);
		this.width=w;
		this.height=h;
	}
	
//Graphics : �ڹ��� ���� �׷��� ó�� Ŭ����
	@Override
	public void paint(Graphics g) { //Draw interface�� �޼ҵ� �������̵�

		// Ÿ���׸���
		// �� ���� �׸�
//		g.fillOval(a, b, width, height);
		//���빰 �ȿ��� ä��
		g.setColor(Color.green);
		g.fillOval(a, b, width, height);
	}

}
