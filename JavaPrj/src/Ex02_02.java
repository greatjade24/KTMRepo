import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {

		int a;
		int b;
		int result;
		
		Scanner S = new Scanner(System.in);
		
		a = S.nextInt();
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
