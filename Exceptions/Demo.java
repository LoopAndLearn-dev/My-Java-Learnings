package exception;

//throw keyword

public class Exception5 {
	void fun1() {
		System.out.println("Entering Fun1");
		try {
			fun2();
		} catch (Exception e) {
			System.out.println("Exception caught in Fun1");
			throw e;
		}
	}

	void fun2() {
		System.out.println("Entering fun2");
		try {
			int a, b, c;
			a = 10;
			b = 0;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Exception caught in Fun2");
			throw e;
		}
	}
}
public class Demo5 {
	public static void main(String[] args) {
		System.out.println("Entering the main");
		Exception5 e5 = new Exception5();
		try {
			e5.fun1();
		} catch (Exception e) {
			System.out.println("Exception caught in main");
		}
		System.out.println("Exiting main normally");
	}
}
