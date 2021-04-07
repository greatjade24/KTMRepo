package BackJoon;

import java.util.Scanner;

public class B14928 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		long rem = 0;
		
		for(int i = 0; i < num.length(); i++) {
			rem = (rem * 10 + (num.charAt(i) - '0')) % 20000303;
		}
		
		System.out.println(rem);
	}

}
