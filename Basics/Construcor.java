package construct;

//Constructor - constructors are executed only during the construction of the object
//ZERO PARAMETERIZED CONSTRUCTOR
public class Student {
	String name;
	int age;
	float height;

	// Zero parameter constructor given by the compiler itself
	
	void setData(String n, int a, float h) {
		name = n;
		age = a;
		height = h;
	}
}

public class StudentApp {
	public static void main(String[] args) {

		// Zero Parameter Construcor

		Student s = new Student();
		System.out.println(s.name); // null
		System.out.println(s.age); // 0
		System.out.println(s.height); // 0.0
		System.out.println();
  }
}
//PARAMETERIZED CONSTRUCTOR
package construct;
public class Student2 {
	String name;
	int age;
	float height;

	// Parameterized constructor
	Student2(String n, int a, float h) {
		name = n;
		age = a;
		height = h;
	}

	Student2() {
		name = null;
		age = 0;
		height = 0.0f;
	}
}
public class StudentApp {
	public static void main(String[] args) {

		// Parameterized Constructor

		Student2 s2 = new Student2("Sima", 34, 4.6f);
		System.out.println(s2.name); // Sita
		System.out.println(s2.age); // 34
		System.out.println(s2.height); // 4.6
		System.out.println();

		Student2 s3 = new Student2();
		System.out.println(s3.name); // null
		System.out.println(s3.age); // 0
		System.out.println(s3.height); // 0.0f
	}
}
