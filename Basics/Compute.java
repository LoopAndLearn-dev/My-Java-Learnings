public interface Compute {
	void add();
	void sub();
}

public abstract class Demo implements Compute {

	@Override
	public void add() {
		int a, b, c;
		a = 10;
		b = 10;
		c = a + b;
		System.out.println("Sum is " + c);
	}

	@Override
	public abstract void sub();

	/*
	 * @Override 
	 * public void sub() {
	 * int x, y, z; x = 30; y = 20; z = x - y;
	 * System.out.println("Difference is " + z); }
	 */
}
public class DemoImpl extends Demo{
	@Override
	public void sub() {
	}
}
public class DemoApp {
	public static void main(String[] args) {
		DemoImpl d1 = new DemoImpl();
		Demo ptr = d1;
		ptr.add();
		ptr.sub();
	}
}
