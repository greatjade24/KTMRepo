package BackJoon;

import java.util.Scanner;

public class B21300 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[6];
		int res = 0;
		
		for(int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
			res = res + (num[i] * 5); 
		}
		
		System.out.println(res);
		
	}

}
