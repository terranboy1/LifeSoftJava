import java.math.BigInteger;

public class BigInt {
	static BigInteger factorial(int n) {
		BigInteger fac = BigInteger.ONE; //�ʱⰪ �Ҵ�
		for(int i=1; i<=n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.format("%3d! = %d\n", i, factorial(i));
		}

	}

}
