package exception;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Entering the main");
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		b = sc.nextInt();
		try {                                                 // Exception Handling
			c = a / b;
			System.out.println("Result is " + c);
		} catch (Exception e) {
			System.out.println("Problem in division");
		}
		System.out.println("Exiting main normally");
	}
}
