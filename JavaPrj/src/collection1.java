import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collection1 {

	public static void main(String[] args) {
		//List인터페이스는 메모리에 올릴수 없기 때문에 ArrayList 클래스를 통해 메모리에 올림
		List<String> rList = new ArrayList<>();
		
		//List 컬렉션 프레임워크에 데이터를 추가함
		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");
		
		//배열크기 출력
		System.out.println("배열의 크기 : " + rList.size());
		
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]번째 배열 기억공간 : " + rList.get(i));
		}

		//List컬렉션을 통해 저장된 데이터를 가져올때 for문을 쓰지 않고, while문을 쓰길 권장함
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String name = (String) it.next();
			
			System.out.println("이름 : " + name);
		}
	}

}
