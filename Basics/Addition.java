//Method Overloading : More than one method, with same method name but, change in the signature.

package overlo;
public class Addition {
	void add() {
		int a, b, c;
		a = 10;
		b = 20;
		c = a + b;
		System.out.println(c);
	}

	void add(int a) {
		int b = 38;
		int c = a + b;
		System.out.println(c);
	}

	void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	void add(int a, double b) {
		double c = a + b;
		System.out.println(c);
	}

	void add(float a, float b) {
		float c = a + b;
		System.out.println(c);
	}

	void add(double a, double b) {
		double c = a + b;
		System.out.println(c);
	}

	void add(int a, float b) {
		float c = a + b;
		System.out.println(c);
	}

	void add(float a, int b) {
		float c = a + b;
		System.out.println(c);
	}

	void add(int a, float b, double c) {
		double d = a + b + c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.add();
		a1.add(24);
		a1.add(3.4, 5.6);
		a1.add(4.6, 7.60);
		a1.add(3.4, 5);
		a1.add(6, 3.6);
		a1.add(4, 5.7);
		a1.add(3, 4);
		a1.add(3, 4.2f, 3.6);
	}
}
