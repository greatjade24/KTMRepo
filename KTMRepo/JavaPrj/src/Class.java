import java.io.IOException;
import java.util.Scanner;

public class Class {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;

		while (true) {
			System.out.printf("��� �� ù ��° ���� �Է� : ");
			a = s.nextInt();
			System.out.printf("��� �� �� ��° ���� �Է� : ");
			b = s.nextInt();
			System.out.printf("��� �� �����ڸ� �Է� : ");
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
				System.out.println("�����ڸ� �߸� �Է��߽��ϴ�");
			}
		}

	}

}
