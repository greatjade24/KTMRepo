import java.util.Scanner;

public class PP02 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int result;
		int k;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("ù��° ��� �� ���� �Է��ϼ��� : ");
		num1 = s.nextInt();
		System.out.printf("<1>���� <2>���� <3>���� <4>������ : ");
		k = s.nextInt();
		System.out.printf("�ι�° ��� �� ���� �Է��ϼ��� : ");
		num2 = s.nextInt();
		
		if(k == 1) {
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		}
		
		if(k == 2) {
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		}
		
		if(k == 3) {
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
		}
		
		if(k == 4) {
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
		}
			
	}

}
