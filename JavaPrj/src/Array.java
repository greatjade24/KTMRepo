import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int aa[] = new int[4];
		int i;
		int hap = 0;
		
		for(i = 0; i < aa.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
			aa[i] = s.nextInt();
			
			hap = hap + aa[i];
		}
		
		System.out.println("합계 ==> " + hap);
	}

}
