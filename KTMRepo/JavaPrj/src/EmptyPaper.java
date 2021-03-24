import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmptyPaper {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<String>();
		
		rList.add("°´Ã¼ÁöÇâ ÇÁ·Î±×·¡¹Ö");
		rList.add("ÇÏµÓ");
		rList.add("MongoDB");
		
		int a = 1;
		
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String st = it.next();
			if(st.equals("ÇÏµÓ")) {
				System.out.println("<" + st + ">");
			}
			else
				System.out.println(st);
			
			a++;
		}
	}
}