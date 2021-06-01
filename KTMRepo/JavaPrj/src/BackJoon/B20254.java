package BackJoon;

import java.util.Scanner;

public class B20254 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ur = sc.nextInt();
		int tr = sc.nextInt();
		int uo = sc.nextInt();
		int to = sc.nextInt();
		
		int res = 56*ur + 24*tr + 14*uo + 6*to;
		
		System.out.println(res);
	}

}
