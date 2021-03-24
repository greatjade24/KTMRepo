
public class Method {

	//무조건 자바 시작할 때 실행되는 첫번째 함수 (메서드)
	public static void main(String[] args) {
		
		System.out.println("main함수 호출 시작!!");
		
		int res = sum(1, 2); //sum함수 호출
		
		System.out.println("sum함수 실행 결과 : " + res);
		
		System.out.println("main함수 호출 끝!!");

	}
	
	//main함수에서 호출되는 함수
	public static int sum(int i1, int i2) {
		
		System.out.println("sum함수 호출 시작!!");
		
		int sum = 0;
		
		for(int i = i1; i <= i2; i++)
			sum += i;
		
		System.out.println("sum함수 호출 끝!!");
		
		return sum;
	}

}
