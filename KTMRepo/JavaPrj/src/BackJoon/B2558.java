package BackJoon;

import java.util.Scanner;

public class B2558 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int res;

		while (true) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > 0 && a < 10 && b > 0 && b < 10) {
				res = a + b;
				break;
			}
		}
		
		System.out.println(res);
	}

}
