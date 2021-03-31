package BackJoon;

import java.util.Scanner;

public class B4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for(int i = 0; i < n; i++) {
			int hap = 0;
			double a = 0;
			int m = sc.nextInt();
			int num[] = new int[m];
			for(int j = 0; j < m; j++) {
				num[j] = sc.nextInt();
				hap += num[j];
			}
			int avg = hap / m;
			for(int k = 0; k < m; k++) {
				if(num[k] > avg)
					a++;
			}
			double ratio = a/(double)m*100;
			System.out.printf("%.3f%% \n", ratio);
		}

	}

}
