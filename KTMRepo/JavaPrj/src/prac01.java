
public class prac01 {

	public static void main(String[] args) {

		int i, j, k;
		
		for(i = 0; i < 4; i++) {
			for(j = 3; j > i; j--) 
				System.out.printf(" ");
			for(k = 0; k <= i; k++) 
				System.out.printf("*");
			
			System.out.println();
		}
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j <= i; j++)
				System.out.printf(" ");
			for(k = 3; k > i; k--)
				System.out.printf("*");
			
			System.out.println();
		}

	}

}
