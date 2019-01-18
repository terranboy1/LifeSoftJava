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
	
//Graphics : 자바의 내장 그래픽 처리 클래스
	@Override
	public void paint(Graphics g) { //Draw interface의 메소드 오버라이딩

		// 타원그리기
		// 선 색깔만 그림
//		g.fillOval(a, b, width, height);
		//내용물 안에도 채움
		g.setColor(Color.green);
		g.fillOval(a, b, width, height);
	}

}
