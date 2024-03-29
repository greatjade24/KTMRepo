package BackJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B1271 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger m = sc.nextBigInteger();
		BigInteger n = sc.nextBigInteger();
		
		BigInteger res = m.divide(n);
		BigInteger rem = m.remainder(n);
		
		System.out.println(res);
		System.out.println(rem);
	}

}
