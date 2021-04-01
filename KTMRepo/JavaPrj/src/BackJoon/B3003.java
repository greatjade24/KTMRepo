package BackJoon;

import java.util.Scanner;

public class B3003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int king = 1, queen = 1, rook = 2, bis = 2, kni = 2, pawn = 8;

		int[] num = new int[6];

		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < 6; i++) {

			switch (i) {
			case 0:
				System.out.println(king - num[i]);
				continue;
			case 1:
				System.out.println(queen - num[i]);
				continue;
			case 2:
				System.out.println(rook - num[i]);
				continue;
			case 3:
				System.out.println(bis - num[i]);
				continue;
			case 4:
				System.out.println(kni - num[i]);
				continue;
			case 5:
				System.out.println(pawn - num[i]);
				continue;
			}
		}
	}

}
