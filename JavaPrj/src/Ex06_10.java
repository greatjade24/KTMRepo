import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int hap = 0;
		int i;
		int num;
		
		System.out.printf("최종 값을 입력하세요 : ");
		num = s.nextInt();
		
		for(i = 1; i <= num; i++) {
			hap = hap + i;
		}

		System.out.printf("1부터 %d까지의 합 = %d", num, hap);

	}

}
