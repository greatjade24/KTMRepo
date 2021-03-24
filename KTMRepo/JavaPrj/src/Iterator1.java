import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1{
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("~");
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String name = (String) it.next();
			
			System.out.println(name);
			
		}
	}
}