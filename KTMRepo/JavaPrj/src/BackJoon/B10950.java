package BackJoon;

import java.util.Scanner;

public class B10950 {

	public static void main(String[] args) {

		int a, b, j, t;
		
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		
		for(j = 1; j <= t; j++){
			a = s.nextInt();
			b = s.nextInt();
			System.out.println(a+b);
		}

	}

}
