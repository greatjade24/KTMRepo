public class Array {

	public static void main(String[] args) {
		
		int i;
		int hap = 0;
		int[] num = new int[90];
		
		for(i = 0; i < num.length; i++) {
			num[i] = i + 11;
			hap += num[i];
		}
		
		i = 0;
		while(i < num.length) {
			System.out.println("num[" + i + "]" + " = " + num[i]);
			i++;
		}
		
		System.out.println("гу = " + hap);
	}
}
