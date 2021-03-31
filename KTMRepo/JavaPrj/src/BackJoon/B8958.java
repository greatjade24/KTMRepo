package BackJoon;

import java.util.Scanner;

public class B8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ox[] = new String[9999];
		int n = sc.nextInt();
		int a = 0, cnt = 0;
		
		for(int i = 0; i < n; i++) {
			ox[i] = sc.next();
			}
		
		for(int i = 0; i  <n; i++) {
			cnt = 0; 
			a = 0;
			for(int j = 0; j < ox[i].length(); j++) {
				if(ox[i].charAt(j) == 'O') {
					a++;
					cnt += a;
				}
				else if(ox[i].charAt(j) == 'X') {
					a = 0;
				}
				else System.out.println("장난하냐?");
					
			}
			System.out.println(cnt);
		}

	}

}
