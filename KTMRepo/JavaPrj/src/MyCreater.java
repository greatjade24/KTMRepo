
public class MyCreater {

	MyCreater(){
		System.out.println("�� �⺻���� ������ �Լ�!");
	}
	
	MyCreater(String pname){
		System.out.println("�� ���� ���� �Լ�!");
	}
	
	private String name;
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
