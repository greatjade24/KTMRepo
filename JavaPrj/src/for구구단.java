
public class for������ {

	public static void main(String[] args) {

		int i, k;
		
		for(i = 3; i <= 8; i++) {
			if(i == 3 || i == 5) 
				System.out.println("<" + i + "��>");
			
			for(k = 1; k <= 9; k++) 
				System.out.println(i + " * " + k + " = " + i*k);
			
			System.out.println("");
		}

	}

}
