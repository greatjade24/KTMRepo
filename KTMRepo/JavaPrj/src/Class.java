import java.io.IOException;
import java.util.Scanner;

public class Class {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;

		while (true) {
			System.out.printf("계산 할 첫 번째 수를 입력 : ");
			a = s.nextInt();
			System.out.printf("계산 할 두 번째 수를 입력 : ");
			b = s.nextInt();
			System.out.printf("계산 할 연산자를 입력 : ");
			ch = (char) System.in.read();

			switch (ch) {
			case '+':
				System.out.println(a + " + " + b + " = " + (a + b));
				break;
			case '-':
				System.out.println(a + " - " + b + " = " + (a - b));
				break;
			case '*':
				System.out.println(a + " * " + b + " = " + (a * b));
				break;
			case '/':
				System.out.println(a + " / " + b + " = " + (a / b));
				break;
			case '%':
				System.out.println(a + " % " + b + " = " + (a % b));
				break;
			default:
				System.out.println("연산자를 잘못 입력했습니다");
			}
		}

	}

}
