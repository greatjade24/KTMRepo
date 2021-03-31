package BackJoon;

import java.util.Scanner;

public class B2739 {

	public static void main(String[] args) {
		
		int n, k;
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(k = 1; k <= 9; k++)
			System.out.println(n + " * " + k + " = " + n*k);
		
		
	}

}
