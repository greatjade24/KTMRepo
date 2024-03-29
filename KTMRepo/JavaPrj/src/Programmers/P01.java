package Programmers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = null;
		int[] res = null;
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				set.add(num[i] + num[j]);
			}
		}
		
		int k = 0;
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			res[k] = it.next();
		}
		
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
