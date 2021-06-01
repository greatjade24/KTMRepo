package BackJoon;

import java.util.Scanner;

public class B20492 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res1 = (int) (n - (n * 0.22));
		int res2 = (int) (n - (n * 0.2 * 0.22));

		System.out.println(res1 + " " + res2);
	}

}
