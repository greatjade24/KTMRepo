import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmptyPaper {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<String>();
		
		rList.add("��ü���� ���α׷���");
		rList.add("�ϵ�");
		rList.add("MongoDB");
		
		int a = 1;
		
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String st = it.next();
			if(st.equals("�ϵ�")) {
				System.out.println("<" + st + ">");
			}
			else
				System.out.println(st);
			
			a++;
		}
	}
}