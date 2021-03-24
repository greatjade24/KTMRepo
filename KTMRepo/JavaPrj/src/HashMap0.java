import java.util.HashMap;
import java.util.Map;

public class HashMap0 {

	public static void main(String[] args) {

		//HashMap 데이터타입 정의시 키와 값에 저장될 데이터 타입을 정의하며, 메모리에 올림
		Map<String, String> pMap = new HashMap<>();
		
		//키와 값을 쌍으로 데이터 추가하기
		pMap.put("name", "이협건");
		pMap.put("email", "hglee67@kopo.ac.kr");
		pMap.put("dept", "데이터분석과");
		
		//데이터 불러오기
		System.out.println("---------------------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("오타"));
		System.out.println("---------------------------------");
	}

}
