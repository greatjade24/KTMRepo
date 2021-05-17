package BackJoon;

import java.util.Scanner;

public class B17256 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ax, ay, az;
		int bx, by, bz;
		int cx, cy, cz;
		
		ax = sc.nextInt();
		ay = sc.nextInt();
		az = sc.nextInt();
		cx = sc.nextInt();
		cy = sc.nextInt();
		cz = sc.nextInt();
		
		bx = cx - az;
		by = cy / ay;
		bz = cz - ax;
		
		System.out.println(bx + " " + by + " " + bz);
	} 

}
