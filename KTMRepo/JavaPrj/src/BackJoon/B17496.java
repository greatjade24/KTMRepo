package BackJoon;

import java.util.Scanner;

public class B17496 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		int c = sc.nextInt();
		int p = sc.nextInt();
		
		int res = (n - 1) / t * c * p;
		
		System.out.println(res);
	}

}
