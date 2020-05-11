import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {

		int a;
		int b;
		int result;
		
		Scanner S = new Scanner(System.in);
		
		System.out.printf("첫번째 계산 할 값을 입력하세요 = ");
		a = S.nextInt();
		System.out.printf("두번째 계산 할 값을 입력하세요 = ");
		b = S.nextInt();
		
		result = a + b;
		System.out.println((a + " + " + b + " = " + result));
		
		result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		
		result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		
		result = a / b;
		System.out.println(a + " / " + b + " = " + result);

	}

}
