package encapsulation;

public class Students {
	String name;
	int age;
	double height;

	public void setData(String name, int age, double height) {

//shadowing - represents default values
		name = name;
		age = age;
		height = height;

//shadowing problem can be overcome by - this keyword
		this.name = name;
		this.age = age;
		this.height = height;
	}
}
package encapsulation;

public class StudentsApp {
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.setData("Bheem", 23, 4.5);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
	}
}
