package Codeup;

import java.util.Scanner;

public class C1014 {

	public static void main(String[] args) {
		
		String x, y;
		
		Scanner s = new Scanner(System.in);
		x = s.nextLine();
		y = s.nextLine();
		
		System.out.printf("%c %c", y.charAt(0), x.charAt(0));
	}

}
