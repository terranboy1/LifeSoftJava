package ch11_abstract;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//���ø�(Applet) : ������������ ����Ǵ� �ڹ� ���α׷�.
//(������������ ����Ǵٺ��� ������ ������ �߻��� ���� �־���.
//���ø��� ����Ƿ��� �ٿ��� �޾ƾ��ϴµ� �ű⿡ �Ǽ��ڵ带 ���� ��ʰ� ������
//�׷��� ������������ ���� ���ø� �����ϰԵ�..
//�׷��� ����Ŭ���� ���ø� ���� �ʱ� �ǰ���.
//�׷��� ���ø� ���� �������̶���� �ٸ� ����� �̿��� �ϴ� �� ����. �ϴ� ���� ���ø�.
public class DrawUse extends Applet {  //AppletŬ���� import.(JApplet�� �־��) (�ڹ�9�������� �����ϱ� �ǰ��Ѵٰ� ¦��� ���´��)
	//shape1, 2�� Ŭ���� ������ ���������� ����ϹǷ� ��������� ����.
	Draw shape1; 
	Draw shape2;
	
	public DrawUse() {
		System.out.println("������ ȣ��");
		shape1 = new DrawCircle(30,30,60,80); //�¿캯 �ڷ����� �ٸ���. Draw�� ��Ӱ��迡�� ���� �ִ�. Draw�� �������̽�(�θ�), �캯�� �ڼ�Ŭ����. ������
		shape2 = new DrawLine(10, 20, 150, 100); // �տ� 2���� ���� ������ǥ, �ڿ�2���� �׸���. �ڹٴ� ������ �»���̴�.
//		setBackground(Color.ORANGE); �̰� �۵��� �ȵ�...
	}

	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		System.out.println("paint ȣ��");
		//drawString("���ڿ�":,x,y)
		g.drawString("�ڹ� �׷���", 100, 60);
		shape1.paint(g);
		shape2.paint(g);
	}
}
//���θ޼��尡 ���µ� �� ���θ޼��尡 �־�߸� ���α׷��� ���ư��°� �ƴϴ�.
//���θ޼��尡 �ʿ��� ���� �ܼ��������α׷�, �������� ���α׷��� �ַ� ����.
//�ȵ���̵峪 �����α׷����� ���� ��쿣 ���θ޼��� ���� �� �ֵ�.