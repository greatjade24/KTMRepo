import java.util.Scanner;

public class PP03 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int result;
		char k;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("ù��° ��� �� ���� �Է��ϼ��� : ");
		num1 = s.nextInt();
		System.out.printf("+, -, *, /, %% �� �ϳ��� �Է��ϼ��� : ");
		k = s.next().charAt(0);
		System.out.printf("�ι�° ��� �� ���� �Է��ϼ��� : ");
		num2 = s.nextInt();

		if(k == '+') {
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		}
		
		if(k == '-') {
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		}
		
		if(k == '*') {
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
		}
		
		if(k == '/') {
			if(num2 == 0)
				System.out.println("0���� ������ ����� �Ұ����մϴ�.");
			else {
			result = num1 / num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			}
		}
		
		if(k == '%') {
			if(num2 == 0)
				System.out.println("0���� ������ ����� �Ұ����մϴ�.");
			else {
			result = num1 % num2;
			System.out.println(num1 + "�� " + num2 + "(��)�� ������ �� �������� " + result + "�Դϴ�.");
			}
		}
	}

}
