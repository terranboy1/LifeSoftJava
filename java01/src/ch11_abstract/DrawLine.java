package ch11_abstract;

import java.awt.Color;
import java.awt.Graphics;

public class DrawLine extends Point implements Draw {
	private int x, y;
	public DrawLine(int a, int b, int x, int y) {
		super(a,b);
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void paint(Graphics g) { //Draw interface의 메소드 오버라이딩
		g.setColor(Color.blue); //선 색깔
		g.drawLine(a, b, x, y); //직선 그려주는 메서드
	}

}
