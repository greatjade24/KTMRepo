import java.util.Scanner;

public class PP01 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		int result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("ù��° ��� �� ���� �Է��ϼ��� : ");
		a = s.nextInt();
		System.out.printf("�ι�° ��� �� ���� �Է��ϼ��� : ");
		b = s.nextInt();
		System.out.printf("����° ��� �� ���� �Է��ϼ��� : ");
		c = s.nextInt();
		System.out.printf("�׹�° ��� �� ���� �Է��ϼ��� : ");
		d = s.nextInt();
		
		result = a + b + c + d;
		
		System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + result);

	}

}
