package hello;

class Computer {
	String brand;	//Ʒ��
}
public class SxtStu {
	// field
	int id;
	String sname;
	int age;
	Computer comp;
	
	void study() {
		System.out.println("������ѧϰ��ʹ�����ǵĵ��ԣ�"+comp.brand);
	}
	SxtStu() {
	}
	public static void main(String[] args) {
		SxtStu stu1 = new SxtStu();
		stu1.sname = "����";
		Computer comp1 = new Computer();
		comp1.brand = "����";
		stu1.comp = comp1;
	
		stu1.study();
	}
}