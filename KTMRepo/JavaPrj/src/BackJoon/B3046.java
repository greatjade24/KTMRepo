package BackJoon;

import java.util.Scanner;

public class B3046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int r1 = sc.nextInt();
		int avg = sc.nextInt();
		
		int r2 = avg * 2 - r1;
		
		System.out.println(r2);
	}

}
