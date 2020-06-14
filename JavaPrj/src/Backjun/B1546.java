package Backjun;

import java.util.Arrays;
import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double num[] = new double[n];
		double avg;
		double max = 0, hap = 0;
		
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		max = num[n-1];
		
		
		for(int i = 0; i < n; i++) {
			num[i] = num[i]/max*100;
			hap += num[i];
		}
		
		avg = hap / (double)n;
		
		System.out.println(avg);

	}

}
