
public class while1 {

	public static void main(String[] args) {
		
		int i;
		int k;
		
		i = 3;
		
		while(i <= 8) {
			if(i == 3)
				System.out.println("<3´Ü>");
			
			else if(i == 5)
				System.out.println("<5´Ü>");
			
			k = 1;
			
			while(k <= 9) {
				System.out.println(i + " * " + k + " = " + i * k);
				k++;
			}
			System.out.println("");
			i++;
		}

	}

}
