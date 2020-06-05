import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmptyPaper {

	public static void main(String[] args) {
		
		Set<String> li = new HashSet<String>();
		
		li.add("°´Ã¼ÁöÇâ ÇÁ·Î±×·¡¹Ö");
		li.add("ÇÏµÓ");
		li.add("MongoDB");
		
		int a = 1;
		
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			String st = it.next();
			if(st.equals("ÇÏµÓ")) {
				System.out.println("<" + st + ">");
				break;
			}
			else
				System.out.println(st);
			
			a++;
		}
	}
}