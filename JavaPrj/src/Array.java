public class Array {

	public static void main(String[] args) {
		
		int i;
		int val = 11, hap = 0;
		int[] num = new int[90];
		
		for(i = 0; i < num.length; i++) {
			num[i] = val;
			val ++;
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
