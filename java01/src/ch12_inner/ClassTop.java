package ch12_inner;

public class ClassTop {

	public static void main(String[] args) {
		AA.BB.CC c = new AA.BB.CC();
		
		System.out.println("CC클래스 내부변수 CC= "+c.cc);
	}
}

class AA {
	static class BB {
		static int bb = 20;
		static class CC {
			int cc= bb+10;
		}
	}
}
