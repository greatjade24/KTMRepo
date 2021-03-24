package Backjun;

import java.util.Scanner;

public class B10 {

	public static void main(String[] args) {

		int A, B, C;
		
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		

	}

}
