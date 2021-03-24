
public class PP15 {

	public static void main(String[] args) {
		
		int i;
		
		for(i = 0; i < 128; i++) {
			if(i % 16 == 0) {
				System.out.println("------------------------");
				System.out.println("10진수           16진수         문자");
				System.out.println("------------------------");
			}
			System.out.printf("%d          %x        %c \n", i, i ,i);
		}
			

	}

}
