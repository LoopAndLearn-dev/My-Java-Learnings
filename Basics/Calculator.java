
//<<-----------Types of Methods in JAVA----------->>

package calc;
//----1.Methods which accepts parameter and has a return type---->>

public class Calculator {
	int sub(int x,int y) {
		int z;
		z = x-y;
		return z;
	}
}
public class CalApp {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int a,b,res;
		a=125;
		b=25;
		res=c.sub(a,b);
		System.out.println(res);
  }
}

//----2.A method which accepts only parameter but does not have **return** type---->>

public class Calculator{
	void add(int x, int y) {
		int z = x+y;
		System.out.println(z);
	}
}
public class CalApp {
	public static void main(String[] args) {
		Calculator c2 = new Calculator();
		int a,b;
		a=150;
		b=50;
		c2.add(a,b);
    }
}

//----3.A method which do not accept **parameter**, but only accepts return type---->>

public class Calculator{
	int mul() {
		int a,b,c;
		a=12;
		b=12;
		c=a*b;
		return c;
	}
}
public class CalApp {
	public static void main(String[] args) {
		Calculator c3 = new Calculator();
		int res = c3.mul();
		System.out.println(res);
    }
}
    
//----4.A method which do not accept both **parameter and return type**---->>

public class Calculator{
	void add() {
		int x,y,z;
		x=60;
		y=20;
		z=x+y;
		System.out.println(z);
	}
}
public class CalApp {
	public static void main(String[] args) {
		Calculator c4 = new Calculator();
		c4.add();
	}
}
