
public class OverLoading {
	
	public static int sum(int a, int b) {
		return sum(a, b, 0, 0);
	}
	
	public static int sum(int a, int b, int c) {
		return sum(a, b, c, 0);
	}
	
	public static int sum(int a, int b, int c, int d) {
		
		int res = a + b + c + d;
		
		return res;
	}
}
