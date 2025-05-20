package exception;

import java.util.*;

public class CustomExcep {
	public static void main(String[] args) {
		System.out.println("Entering the main normally");
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		b = sc.nextInt();
		try {
			if (a > b) {
				c = a - b;
				System.out.println(c);
			} else {
				throw new CEDemo();
			}
		} catch (CEDemo e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Exiting main normally");
	}
}
