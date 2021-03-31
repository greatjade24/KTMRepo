package BackJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class B4673 {

	public static void main(String[] args) {
		
		int k = 1;
		int num[] = new int[10000];
	
		
		Set<Integer> rSet = new HashSet<Integer>();
		List<Integer> rList = new ArrayList<Integer>();
		List<Integer> r2List = new ArrayList<Integer>();
		
		num[0] = 0;
		
		loop:
		while(k <= 10000) {
		if(k < 100)
			num[k-1] = k + k/10 + k%10;
			
		else if(k < 1000)
			num[k-1] = k + k/100 + (k%100/10) + k%10;
			
		else if(k < 10000)
			num[k-1] = k + k/1000 + (k%1000/100) + (k%100/10) + k%10;
				
		else if(k == 10000)
			num[k-1] = 10001;
				
		if(num[k-1] > 10000){
			k++;
			continue loop;
		}
				
		rSet.add(num[k-1]);
				 
		k++;
		}
		
		Iterator<Integer> it = rSet.iterator();
		
		while(it.hasNext()) {
			int str = it.next();
			rList.add(str);
		}
		
		Collections.sort(rList);
		
		
		for(int l = 0; l < 10000; l++) {
			if(rList.contains(l)) {
				continue;
			}
			else r2List.add(l);
		}
		
		r2List.remove((Integer)0);
		
		Iterator<Integer> it2 = r2List.iterator();
		
		while(it2.hasNext()) {
			int res = it2.next();
			System.out.println(res);
		}
		
	}

}