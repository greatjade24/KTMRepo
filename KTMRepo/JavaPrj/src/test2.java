
public class test2 {

	public static void main(String[] args) {
		int i = 0, hap = 0;
		int num[] = new int[90];
		
		for(i = 0; i < 90; i++) {
			num[i] =  (i + 10) + 1;
			hap = hap + num[i];
		}
		
		i = 0;
		
		while(i < 90) {
			System.out.println(num[i]);
			i++;
		}
		System.out.println(hap);

	}

}
