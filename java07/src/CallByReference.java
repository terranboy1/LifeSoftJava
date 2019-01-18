import java.util.Arrays;

public class CallByReference {
	
	static void operator(int x) {
		x = 3;
	}

	public static void main(String[] args) {
		
		int a = 10;
		
		operator(a);
		System.out.println(a);
		
		

	}

}
