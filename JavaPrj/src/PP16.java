import java.util.Scanner;

public class PP16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i;
		int count;
		String str;
		
		System.out.printf("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		count = str.length();
		
		System.out.println("�Է��� ���ڿ� : " + str);
		System.out.printf("�Ųٷ� ������ ���ڿ� : ");
		
		for(i = count - 1;i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}

	}

}
