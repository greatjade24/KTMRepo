package Backjun;

import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {

		int h, m;
		
		Scanner s = new Scanner(System.in);
		h = s.nextInt();
		m = s.nextInt();
		
		if(m - 45 < 0) {
			m = 60 + (m - 45);
			h--;
			if(h < 0)
				h = 24 + h;
		}
		
		else
			m = m - 45;
		
		System.out.printf("%d %d", h, m);

	}

}
