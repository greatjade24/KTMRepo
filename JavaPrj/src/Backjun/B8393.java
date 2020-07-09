package Backjun;

import java.util.Scanner;

public class B8393 {

	public static void main(String[] args) {

		int i, n;
		int hap = 0;
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(i = 1; i <= n; i++) {
			hap += i;
		}
		
		System.out.println(hap);
	}

}
