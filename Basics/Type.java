//Typecasting - 2 types

package type;
public class Type {
	public static void main(String[] args) {
		
//case 1 == Implicit Typecasting(by compiler)
		byte a;
		int b;
		a=10;
		b=a;
		System.out.println(b);
		
//case 2 == Explicit Typecasting(by user)
		int c;
		byte d;
		c=9999;
		d=(byte)c;
		System.out.println(d);
	}
}
