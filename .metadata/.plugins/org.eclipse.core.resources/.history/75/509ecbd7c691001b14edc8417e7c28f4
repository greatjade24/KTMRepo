package Backjun;

import java.util.Scanner;

public class B10039 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int hap = 0;
		
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] % 5 != 0)
				System.out.println("점수는 5의 배수여야 합니다.");
			
			else if(num[i] < 40)
				num[i] = 40;
			
			hap += num[i];
		}
		int avg = hap / 5;
		
		System.out.println(avg);
		
	}

}
