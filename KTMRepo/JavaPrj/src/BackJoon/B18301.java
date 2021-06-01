package BackJoon;

import java.util.Scanner;

public class B18301 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n12 = sc.nextInt();
		
		int num = (n1 + 1) * (n2 + 1) / (n12 + 1) - 1;
		
		System.out.println(num);
	}

}
