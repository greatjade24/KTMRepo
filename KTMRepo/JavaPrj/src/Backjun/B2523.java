package Backjun;

import java.util.Scanner;

public class B2523 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int j;
		
		for(j = 0; j < n; j++) {
			for(int i = 0; i <= j; i++) 
				System.out.printf("*");
			System.out.println("");
		}
		
		for(j = n-1; j > 0; j--) {
			for(int k = j; k > 0; k--)
				System.out.printf("*");
			System.out.println("");
		}
		
	}

}
