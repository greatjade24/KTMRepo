import java.util.Scanner;

public class PP01 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		int result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("첫번째 계산 할 값을 입력하세요 : ");
		a = s.nextInt();
		System.out.printf("두번째 계산 할 값을 입력하세요 : ");
		b = s.nextInt();
		System.out.printf("새번째 계산 할 값을 입력하세요 : ");
		c = s.nextInt();
		System.out.printf("네번째 계산 할 값을 입력하세요 : ");
		d = s.nextInt();
		
		result = a + b + c + d;
		
		System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + result);

	}

}
