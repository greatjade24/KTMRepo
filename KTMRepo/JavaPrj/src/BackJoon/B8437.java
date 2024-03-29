package BackJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B8437 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger apple = sc.nextBigInteger();
		BigInteger dif = sc.nextBigInteger();
		BigInteger a, b;

		if(apple.remainder(two).equals(one)) {
			a = apple.divide(two).add(dif.divide(two).add(one));
			b = apple.divide(two).subtract(dif.divide(two));
		}else {
			a = apple.divide(two).add(dif.divide(two));
			b = apple.divide(two).subtract(dif.divide(two));
		}
		
		System.out.println(a + "\n" + b);
	}

}
