package BackJoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int i;
		int num[] = new int[10];
		int num2[] = new int[10];
		
		for(i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
			num2[i] = num[i] % 42;
		}
		
		Set<Integer> st = new HashSet<Integer>();
		
		for(i = 0; i < 10; i++)
			st.add(num2[i]);
		
		cnt = st.size();
		
		System.out.println(cnt);

	}

}
