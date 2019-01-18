/* 
�� �ڵ� ������ ���� �˾ƾ� �� �͵�
-------------------------------------------------
java.awt ��Ű���� Frame class : ������ ���� ��� ����
public class InnerExam ex
 
 
 
 */


package ch12_inner;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerExam extends Frame{ //F4�������� Type Hierarchy ����.(FrameŬ������ WindowŬ���� ��ӹ�����) 
	public InnerExam() {
		//�θ�������� FrameŬ������ ������ ȣ��, FrameŬ������ ������ â�� ����ִ� Ŭ����. �������� Ÿ��Ʋ ����
		super("���� Ŭ���� �׽�Ʈ"); //frame �����ں��� public Frame(String title)~~ �̷������� �Ű������� Ÿ��Ʋ �Է��� �� �ְ� ��.
		//�������� ����,���� ������ ����. �� setSize�޼���� Window.class�� �޼����ε� �� FrameŬ������ Windows�޼��带 ��ӹ޾Ƽ� �� �� ����.
		setSize(300,400);
		//�������� ȭ�鿡 ǥ��. ����� setVisible(true) ���ϸ� ȭ�� �ȶ䤻�� x��ư ������ �� ������� ������Ʈ �ۼ��ؾߵʤ��� �׷��� Ȯ�� ��� �巡�� �̷��� ���ݾ�.. �̰͵� �����Ѱ� �ƴ϶�..  C���� �̰� �� �����̶� �ָ�..
		setVisible(true); //�ֽ��� JFrameŬ���� ����ϸ� x��ư ������ �ٷ� ������ �۵��ϴµ� ������Ʈ ����� ���� �Ϸ��� �Ϻη� �̷��� �ϴ°Ŵ� �������������� ������
	}
	
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		//�ν��Ͻ� ���������� ������ ���δ�..? addWindowListener�� �ٿ���?? add..�߰��Ѵ�..window��..Listener�� ������.. �������� ������ ������ �� �ִ� ����� �߰��Ѵ�..�� ��..������ �����Ǹ� ��ȣ ���� ����Ǵ� ���̴�..�տ��� �͸�Ŭ���� ��������..? �װž�.. ��ȣ�ȿ� Ŭ������ �����ž�..
		//����.. �� �ڵ� ���̴ϱ� x �����ϱ� ������~!!
		e.addWindowListener(new WindowAdapter() {   //�ٽ��ѹ� ����. �͸�Ŭ������ new �ڷ���(){ } ����.
			//x ��ư�� ������ windowClosing�޼��尡 ������ �ǰ� exit�� ���� ���� ����ȴ�.
			public void windowClosing(WindowEvent e) {
				System.exit(0);  //exit���� ���ڴ� ū �ǹ̰� ���µ� ���������� 0�̸� ��������. -1�̸� ��������� ����.. ��Ȯģ����.
			}
		}); 
 	}
}

//���� �˰����� �ڹٴ� ��� �ü���� ȣȯ�� �� �Ǵ� ������ �ִ� �ݸ鿡
//�ٸ� �� ���� �ڵ����� ���� �׷��� �� ����..
//���̽� ���� �ڵ����� �����ž�..���� ������..