package BackJoon;

import java.util.Scanner;

public class B2475 {

	public static void main(String[] args) {
		
		int[] num = new int[6];
		int res = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			res += num[i]*num[i];
		}
		 
		num[5] = res % 10;
		
		System.out.println(num[5]);
	}

}
