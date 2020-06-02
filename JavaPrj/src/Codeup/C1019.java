package Codeup;

import java.util.Scanner;

public class C1019 {

	public static void main(String[] args) {

		int y, m, d;
		
		Scanner s = new Scanner(System.in);
		y = s.nextInt();
		m = s.nextInt();
		d = s.nextInt();
		
		System.out.printf("%d.%02d.%02d", y, m, d);
	}

}
