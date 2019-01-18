import java.util.Arrays;

public class CallByValue {
	
	static void operator(int[] x) {
		x[0] = 3;
	}

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		
		operator(a);
		System.out.println(Arrays.toString(a)); //°ªÀÌ¹Ù²¼´Ù.
		
		

	}

}
