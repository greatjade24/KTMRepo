import java.util.Scanner;

public class option {

	public static void main(String[] args) {
		
			int a;

			Scanner s = new Scanner(System.in);
			
			System.out.println("정수를 입력하세요 : ");
			a = s.nextInt();

			if (a >= 90)
				System.out.println("A");
			else if (a >= 80)
				System.out.println("B");
			else if (a >= 70)
				System.out.println("C");
			else if (a >= 60)
				System.out.println("D");
			else
				System.out.println("F");

			System.out.println(" 학점 입니다. \n");
		

	}

}
