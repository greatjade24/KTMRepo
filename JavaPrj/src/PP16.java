import java.util.Scanner;

public class PP16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i;
		int count;
		String str;
		
		System.out.printf("문자열을 입력하세요 : ");
		str = s.nextLine();
		
		count = str.length();
		
		System.out.println("입력한 문자열 : " + str);
		System.out.printf("거꾸로 뒤집은 문자열 : ");
		
		for(i = count - 1;i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}

	}

}
