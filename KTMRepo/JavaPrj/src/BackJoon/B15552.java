package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B15552 {

	public static void main(String[] args)  {

		int a, b, j, t;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String s0 = bf.readLine();
			t = Integer.parseInt(s0);
			
			for(j = 0; j < t*2; j += 2) {
			String[] space = new String[2];	
			space = bf.readLine().split(" ");
			a = Integer.parseInt(space[0]);
			b = Integer.parseInt(space[1]);
			bw.write(a+b + "\n");
			}
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}


