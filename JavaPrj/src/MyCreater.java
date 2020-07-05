
public class MyCreater {

	MyCreater(){
		System.out.println("난 기본생성 생성자 함수!");
	}
	
	MyCreater(String pname){
		System.out.println("난 강제 생성 함수!");
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
