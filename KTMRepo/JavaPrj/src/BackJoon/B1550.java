package BackJoon;

import java.util.Scanner;

public class B1550 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String num = "abcdefg";
		int res;
		
		while (num.length() > 6) {

			num = sc.nextLine();
			
			if(num.length() > 6) {
				System.out.println("�Է� ���� �ʰ�. ���Է�");
			}
		}

		res = Integer.valueOf(num, 16);
		
		System.out.printf("%d", res);
	}

}