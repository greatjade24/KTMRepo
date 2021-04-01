package BackJoon;

import java.util.Scanner;

public class B6749 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int young = sc.nextInt();
		int mid = sc.nextInt();
		int dif = mid - young;
		
		System.out.println(mid + dif);
	}

}
