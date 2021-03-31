package BackJoon;

import java.util.Scanner;

public class B1330 {

	public static void main(String[] args) {

		int a, b;
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		if(a > b)
			System.out.println(">");
		
		else if(a < b)
			System.out.println("<");
		
		else
			System.out.println("==");

	}

}
