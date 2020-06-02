package Codeup;

import java.util.Scanner;

public class C1020 {

	public static void main(String[] args) {

		int a, b;
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.printf("%06d-%07d", a, b);

	}

}
