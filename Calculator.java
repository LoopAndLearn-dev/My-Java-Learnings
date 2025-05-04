package calc;

import java.util.Scanner;

public class Calculator {
	int a, b;

	void add() {
		System.out.println("You are adding...");
		int c = a + b;
		System.out.println("Sum is " + c);
	}

	void sub() {
		System.out.println("You are subtracting...");
		int c = a - b;
		System.out.println("Difference is " + c);
	}

	void multiple() {
		System.out.println("You are multiplying...");
		int c = a * b;
		System.out.println("Result is " + c);
	}

	void divide() {
		System.out.println("You are dividing...");
		int c = a / b;
		System.out.println("Result is " + c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		System.out.println("Enter the value of a : ");
		c.a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		c.b = sc.nextInt();
		c.add();
		c.sub();
		c.multiple();
		c.divide();

	}

}
