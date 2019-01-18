
public class VariantParam {

	static void print(String... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
	static void sum(int ... n) {
		int sum=0;
		for(int i=0; i<n.length; i++) {
			sum += n[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		print("java");
		print("java","test");
		
		sum(10,20,30,40,50,60,70,80,90,100);
	}

}
