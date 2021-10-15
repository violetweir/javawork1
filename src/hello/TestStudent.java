package hello;
class student{
	private String id;
	private String name;
	private String sex;
	private int age;
	public student(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getId(){
		return id;
	}
	public String getName() {
		return name; 
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age=age;
	}
}

public class TestStudent {
	public static void main(String arts[]) {
		student stu = new student("0111199","小强","男",20);
		System.out.println("student info:"+"\n年龄: "+stu.getAge());
		stu.setAge(19);
		System.out.println("修改年龄为: "+stu.getAge());
	}
}
