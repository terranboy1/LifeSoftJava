package ch12_inner;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam2 extends Frame{ //F4�������� Type Hierarchy ����.(FrameŬ������ WindowŬ���� ��ӹ�����) 
	public InnerExam2() {
		//�θ�������� FrameŬ������ ������ ȣ��, FrameŬ������ ������ â�� ����ִ� Ŭ����. �������� Ÿ��Ʋ ����
		super("���� Ŭ���� �׽�Ʈ"); //frame �����ں��� public Frame(String title)~~ �̷������� �Ű������� Ÿ��Ʋ �Է��� �� �ְ� ��.
		//�������� ����,���� ������ ����. �� setSize�޼���� Window.class�� �޼����ε� �� FrameŬ������ Windows�޼��带 ��ӹ޾Ƽ� �� �� ����.
		setSize(300,400);
		//�������� ȭ�鿡 ǥ��. ����� setVisible(true) ���ϸ� ȭ�� �ȶ䤻�� x��ư ������ �� ������� ������Ʈ �ۼ��ؾߵʤ��� �׷��� Ȯ�� ��� �巡�� �̷��� ���ݾ�.. �̰͵� �����Ѱ� �ƴ϶�..  C���� �̰� �� �����̶� �ָ�..
		setVisible(true); //�ֽ��� JFrameŬ���� ����ϸ� x��ư ������ �ٷ� ������ �۵��ϴµ� ������Ʈ ����� ���� �Ϸ��� �Ϻη� �̷��� �ϴ°Ŵ� �������������� ������
	}
	
	public static void main(String[] args) {
		InnerExam2 e = new InnerExam2();

//		e.addWindowListener(new ); ��, ���⼭ ctrl+space�� addWindowListener �������̽� ����Ʈ�غ���.����
		e.addWindowListener(new WindowListener() {
					
			//WindowListener�������̽��� �޼��尡 �� 7���ε� �װ� �� �����Ѱ���.
			//���߿� �̷��� �� �ۼ��ؾߵʤ���
			//�츮�� �ʿ信 ���� �ۼ��Ѱ� windowClosing�޼��忳��.
			@Override
			public void windowOpened(WindowEvent e) {
			}	
			@Override
			public void windowIconified(WindowEvent e) {			
			}		
			@Override
			public void windowDeiconified(WindowEvent e) {			
			}		
			@Override
			public void windowDeactivated(WindowEvent e) {			
			}	
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
			@Override
			public void windowClosed(WindowEvent e) {		
			}	
			@Override
			public void windowActivated(WindowEvent e) {
			}
			//�ٵ� �̷��� �ϸ� �ʹ� ��� �����ϴϱ�.. WindowAdapter Ŭ������ �ִµ� ��� �߻�Ŭ������.
			//��� WindowListener�������̽��� implements�ߴ�. �׸��� �װ� ����ߴ�.(InnerExam.java)
			
			
		});
 	}
}
