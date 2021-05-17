package BackJoon;

import java.util.Scanner;

public class B16430 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int resa = b - a;
		int resb = b;
		
		if(b % resa == 0) {
			resb = b / resa;
			resa = 1;
		}
		
		System.out.println(resa + " " + resb);
	}

}
