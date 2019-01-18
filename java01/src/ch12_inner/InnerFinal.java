package ch12_inner;

public class InnerFinal {
	int x = 10;
	void print() {   
		int x = 5; //jdk1.7까지는 final 안붙이면 내부클래스에서 이 지역변수들을 사용하려고하면 컴파일에러 떴음. 근데 1.8 부턴 final안붙여도 에러 아님.
		final int y=20; // 메서드 내부 변수니까 지역변수(local variable). final이 필수있는데 이제 안붙여도 된다고 함.(이거 자바의정석에서 봤는데)
		class Inner {     //아니, 메서드 안에 클래스가?!    (추가적으로 외부클래스가 private로 선언되어있어도 내부클래스에서 접근이 가능함. private은 같은 클래스 안에선 참조가 되거덩)
			void test() {
				System.out.println(x);
				System.out.println(y);
				
				// x = 30;  내부클래스에서 위의 지역변수 사용하려고하면 final 꼭 붙였어야했는데 이젠 그 규약이 풀렸잖아.
				// 근데 그게 생략이 가능한거지 없어진게아니야. 그래서 여전히 final이기에 값을 변경할 수 없어.
			}
		}
		
		// x = 30; final 안하면 이부분에서 짖역변수 값을 바꿔버릴 수 있기 때문에 컴파일 에러로 해논것이였대. 와하 그렇구나.
	}
	
	public static void main(String[] args) {

	}

}
