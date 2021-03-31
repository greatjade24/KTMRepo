package Backjun;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a*b*c;
		int cnt[] = new int[10];
		char num[] = new char[99];
		String r1 = Integer.toString(result);
				
		int i = 0;
		
		while(i < r1.length()) {
			
			num[i] = r1.charAt(i);
			
			switch(num[i]) {
			case '0' : cnt[0]++; break;
			case '1' : cnt[1]++; break;
			case '2' : cnt[2]++; break;
			case '3' : cnt[3]++; break;
			case '4' : cnt[4]++; break;
			case '5' : cnt[5]++; break;
			case '6' : cnt[6]++; break;
			case '7' : cnt[7]++; break;
			case '8' : cnt[8]++; break;
			case '9' : cnt[9]++; break;
			default : System.out.println("장난하냐?");
			}
			i++;			
		}
		
		for(int j = 0; j <= 9; j++)
			System.out.println(cnt[j]);
	}

}
