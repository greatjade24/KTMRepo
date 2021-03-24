
public class test {

	public static void main(String[] args) {

		int i;
		int k;
		
		for(i=3;i<9;i++) {
			if(i == 3) {
				System.out.println("<3´Ü>");
				for(k=1;k<10;k++)
					System.out.printf("%d * %d = %d \n", i, k, i*k);
			}
			
			else if(i == 5) {
				System.out.println("<5´Ü>");
				for(k=1;k<10;k++)
					System.out.printf("%d * %d = %d \n", i, k, i*k);
			}
			
			else {
				for(k=1;k<10;k++)
					System.out.printf("%d * %d = %d \n", i, k, i*k);
			
			}
		}

	}

}
