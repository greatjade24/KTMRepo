package BackJoon;

import java.util.Scanner;

public class B14681 {

	public static void main(String[] args) {

		int x, y;
		
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		
		if(x > 0 && y > 0)
			System.out.println("1");
		if(x < 0 && y > 0)
			System.out.println("2");
		if(x < 0 && y < 0)
			System.out.println("3");
		if(x > 0 && y < 0)
			System.out.println("4");

	}

}
