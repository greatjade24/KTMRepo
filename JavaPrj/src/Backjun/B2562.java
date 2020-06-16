package Backjun;

import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i;
		int max = 0;
		int num[] = new int[9];
		
		for(i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
			if(max < num[i])
				max = num[i];
		}
		
		for(i = 0; i < 9; i++) {
			if(max == num[i])
				break;
		}
		
		System.out.println(max);
		System.out.println(i+1);

	}

}
