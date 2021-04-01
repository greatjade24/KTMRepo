package BackJoon;

import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int k = n; k > i; k--)
				System.out.printf(" ");
			
			for(int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}

	}
}
