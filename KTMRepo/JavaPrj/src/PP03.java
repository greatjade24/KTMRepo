import java.util.Scanner;

public class PP03 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int result;
		char k;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("첫번째 계산 할 값을 입력하세요 : ");
		num1 = s.nextInt();
		System.out.printf("+, -, *, /, %% 중 하나를 입력하세요 : ");
		k = s.next().charAt(0);
		System.out.printf("두번째 계산 할 값을 입력하세요 : ");
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
				System.out.println("0으로 나누면 계산이 불가능합니다.");
			else {
			result = num1 / num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			}
		}
		
		if(k == '%') {
			if(num2 == 0)
				System.out.println("0으로 나누면 계산이 불가능합니다.");
			else {
			result = num1 % num2;
			System.out.println(num1 + "를 " + num2 + "(으)로 나누고 난 나머지는 " + result + "입니다.");
			}
		}
	}

}
