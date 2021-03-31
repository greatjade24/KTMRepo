package BackJoon;

import java.util.Scanner;

public class B15596 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		long res = sum(num);
		
		System.out.println(res);

	}
	
	public static long sum(int[] a) {

		long sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}

}
