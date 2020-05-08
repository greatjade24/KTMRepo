
public class Star {

	public static void main(String[] args) {
		
		int i;
		int j;
		int k;
		
		for(i=0;i<6;i++) {
			for(k=5;k>i;k--) {
				System.out.printf(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}

		for(i=0;i<6;i++) {
			for(k=0;k<=i;k++) {
				System.out.printf(" ");
			}
			for(j=4;j>=i;j--) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
	}

}
