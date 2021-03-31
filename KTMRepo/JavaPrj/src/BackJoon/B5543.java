package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B5543 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		int i, min1, min2, set;
		
		for(i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		min1 = num[0];
		
		int num2[] = new int[2];
		
		for(i = 0; i < 2; i++)
			num2[i] = sc.nextInt();
		
		Arrays.sort(num2);
		
		min2 = num2[0];
		
		set = min1 + min2 - 50;
		
		System.out.println(set);
		
	}

}
