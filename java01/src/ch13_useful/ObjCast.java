package ch13_useful;

public class ObjCast {

	public static void main(String[] args) {
		int a=10;
		Object obj = new Object();

		//좌변 부모, 우변 자식 => 가능
		obj=20;
		//좌변 자식, 우변 부모 => 에러(형변환) (멤버는 자식이 많지만 범위는 부모가 넓음. 계층구조로 본다고 함)
		a = (Integer)obj;
		
		//배열은 같은자료형만 들어올 수 있지만 오브젝트는 다들어올 수 있지.
		Object[] obj2 = {100, 100.5, true, "hello", 'A'};
		for(Object o : obj2) {
			System.out.println(o);
		}
		
//		for(int i=0; i<obj2.length; i++) {
//			System.out.println(obj2[i]);
//		}
	}

}
