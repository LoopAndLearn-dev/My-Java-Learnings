package exception;

import java.util.*;

public class ManualException {
	public static void main(String[] args) {
		System.out.println("Entering the main normally");
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the vaue of a : ");
		a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		b = sc.nextInt();
		try {
			if (a > b) {
				c = a - b;
				System.out.println(c);
			} else {
				Exception e = new Exception();  //1.creating exception object
				throw e;                         //2.object thrown using throw keyword
			}
		} catch (Exception e) {
			System.out.println("Subtraction not possible");
		}
		System.out.println("Exiting main normaly");
	}
}
