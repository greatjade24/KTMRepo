
public class Method {

	//������ �ڹ� ������ �� ����Ǵ� ù��° �Լ� (�޼���)
	public static void main(String[] args) {
		
		System.out.println("main�Լ� ȣ�� ����!!");
		
		int res = sum(1, 2); //sum�Լ� ȣ��
		
		System.out.println("sum�Լ� ���� ��� : " + res);
		
		System.out.println("main�Լ� ȣ�� ��!!");

	}
	
	//main�Լ����� ȣ��Ǵ� �Լ�
	public static int sum(int i1, int i2) {
		
		System.out.println("sum�Լ� ȣ�� ����!!");
		
		int sum = 0;
		
		for(int i = i1; i <= i2; i++)
			sum += i;
		
		System.out.println("sum�Լ� ȣ�� ��!!");
		
		return sum;
	}

}
