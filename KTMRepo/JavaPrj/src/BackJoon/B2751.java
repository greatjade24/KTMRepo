package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class B2751 {

	public static void main(String[] args) {
		
		int i;

		List<Integer> rList = new ArrayList<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		try {
		for(i = 0; i < n; i++) {
			int str1 = sc.nextInt();
			rList.add(str1);
		}
		
		Collections.sort(rList);
		
		Iterator<Integer> it = rList.iterator();
		while(it.hasNext()) {
			bw.write(it.next() + "\n");
		}
		
		bw.flush();
		bw.close();
		
		} catch(NumberFormatException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		}

}
