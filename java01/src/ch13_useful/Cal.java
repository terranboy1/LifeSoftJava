package ch13_useful;

import java.util.Calendar; //임포트~
import java.util.Date;

public class Cal {

	public static void main(String[] args) {
		//Date클래스는 오래되서 잘 안쓰고 요즘은 Calendar클래스 많이쓴다.
		Calendar cal = Calendar.getInstance();
		//Calendar cal = new Calendar(); 캘린더는 이러면 에러가난다. Calendar클래스 눌러보면 추상클래스다. 그래서 getInstance메서드로 처리했다고함.
		//눌러보면 static멤버들.
		System.out.println(cal.get(Calendar.YEAR)); //
		System.out.println(cal.get(Calendar.MONTH) + 1); //0~11월
		System.out.println(cal.get(Calendar.DATE)); // 날짜
		System.out.println(cal.get(Calendar.HOUR)); //12시간으로 출력
		System.out.println(cal.get(Calendar.HOUR_OF_DAY )); //24시간으로 출력
		
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.AM_PM)); //(0은 오전, 1은 오후)
		if(cal.get(Calendar.AM_PM) == 0) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //1년중에 몇번째 날인지.
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //월의 몇번째 날?
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //주중에 몇번째 날인지. 일요일이 1이네.,(일요일1~ 토요일7) 숫자로 리턴해서, 이걸 요일로 갖다가 바꿔보자.
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));//1년중에 몇번째 주인지.
		
		String yoil="";
		switch(cal.get(Calendar.DAY_OF_WEEK)){
		case 1: yoil="일요일"; break;
		case 2: yoil="월요일"; break;
		case 3: yoil="화요일"; break;
		case 4: yoil="수요일"; break;
		case 5: yoil="목요일"; break;
		case 6: yoil="금요일"; break;
		case 7: yoil="토요일"; break;
		}
		System.out.println("오늘은 \"" + yoil+ "\"입니당");
		
		
		//Date형식도 함 보도록 하자.
		System.out.println("date를 보도록 하자.");
		Date date = cal.getTime();
		System.out.println(date.getYear()); // 1900을 더해야 원하는 결과가 나온다.
		System.out.println(date.getMonth());// +1을 해야한다.
		System.out.println(date.getDate()); // 잘 나옴.
	}

}
