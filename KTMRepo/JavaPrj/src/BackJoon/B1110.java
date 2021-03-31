package BackJoon;

import java.util.Scanner;

public class B1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = 0, v = 0, a;
		int[] num = new int[999];
		num[0] = sc.nextInt();
		
		boolean tf = true; 
		
		
		while(tf) {
			if(num[i] < 10)
				a = num[i]%10;
			else
				a = num[i]/10 + num[i]%10;
			
			num[i+1] = (num[i]%10)*10 + (a%10); 
			tf = num[i+1] != num[0];
			
			v++;
			i++;
		}
		System.out.println(v);

	}

}
