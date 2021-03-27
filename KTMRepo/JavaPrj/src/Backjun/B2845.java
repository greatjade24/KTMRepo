package Backjun;

import java.util.Scanner;

public class B2845 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] news = new int[5];
		
			int l = sc.nextInt();
			int p = sc.nextInt();
			
			int res = l * p;
			
			for(int i = 0; i < 5; i++) {
				
				news[i] = sc.nextInt();
			}
		
			for(int i = 0; i < 5; i++) {
				System.out.println(news[i] - res);
			}
	}

}
