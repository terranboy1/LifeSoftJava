package ch13_useful;

import java.util.Calendar; //����Ʈ~
import java.util.Date;

public class Cal {

	public static void main(String[] args) {
		//DateŬ������ �����Ǽ� �� �Ⱦ��� ������ CalendarŬ���� ���̾���.
		Calendar cal = Calendar.getInstance();
		//Calendar cal = new Calendar(); Ķ������ �̷��� ����������. CalendarŬ���� �������� �߻�Ŭ������. �׷��� getInstance�޼���� ó���ߴٰ���.
		//�������� static�����.
		System.out.println(cal.get(Calendar.YEAR)); //
		System.out.println(cal.get(Calendar.MONTH) + 1); //0~11��
		System.out.println(cal.get(Calendar.DATE)); // ��¥
		System.out.println(cal.get(Calendar.HOUR)); //12�ð����� ���
		System.out.println(cal.get(Calendar.HOUR_OF_DAY )); //24�ð����� ���
		
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.AM_PM)); //(0�� ����, 1�� ����)
		if(cal.get(Calendar.AM_PM) == 0) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //1���߿� ���° ������.
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //���� ���° ��?
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //���߿� ���° ������. �Ͽ����� 1�̳�.,(�Ͽ���1~ �����7) ���ڷ� �����ؼ�, �̰� ���Ϸ� ���ٰ� �ٲ㺸��.
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));//1���߿� ���° ������.
		
		String yoil="";
		switch(cal.get(Calendar.DAY_OF_WEEK)){
		case 1: yoil="�Ͽ���"; break;
		case 2: yoil="������"; break;
		case 3: yoil="ȭ����"; break;
		case 4: yoil="������"; break;
		case 5: yoil="�����"; break;
		case 6: yoil="�ݿ���"; break;
		case 7: yoil="�����"; break;
		}
		System.out.println("������ \"" + yoil+ "\"�Դϴ�");
		
		
		//Date���ĵ� �� ������ ����.
		System.out.println("date�� ������ ����.");
		Date date = cal.getTime();
		System.out.println(date.getYear()); // 1900�� ���ؾ� ���ϴ� ����� ���´�.
		System.out.println(date.getMonth());// +1�� �ؾ��Ѵ�.
		System.out.println(date.getDate()); // �� ����.
	}

}
