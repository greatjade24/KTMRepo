package BackJoon;

import java.util.Scanner;

public class B2446 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int j;
		
		for(j = 0; j < n; j++) {
			for(int k = 0; k < j; k++)
				System.out.printf(" ");
			for(int i = n; i > j; i--) 
				System.out.printf("*");
			for(int l = n-1; l > j; l--)
				System.out.printf("*");
			System.out.println("");
		}
		
		for(j = 0; j < n-1; j++) {
			for(int k = n-1; k > j+1; k--)
				System.out.printf(" ");
			for(int i = 0; i <= j+1; i++) 
				System.out.printf("*");
			for(int l = 0; l <= j; l++)
				System.out.printf("*");
			System.out.println("");
		}
		

	}

}
