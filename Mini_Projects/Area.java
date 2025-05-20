package com.abs;

import java.util.Scanner;

abstract public class Geometry {
	double area;

	abstract void input();

	abstract void calcArea();

	void disp() {
		System.out.println("Area is " + area);
	}
}

class Triangle extends Geometry {
	double b, h;

	@Override
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter b: ");
		b = sc.nextDouble();
		System.out.println("Enter h: ");
		h = sc.nextDouble();
	}

	@Override
	void calcArea() {
		System.out.println("Area of Traiangle");
		area = 1 / 2 * b * h;
	}
}

class Rectangle extends Geometry {
	float l, b;

	@Override
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length l : ");
		l = sc.nextFloat();
		System.out.print("Enter breadth b : ");
		b = sc.nextFloat();
	}

	@Override
	void calcArea() {
		System.out.println("Area of Rectangle");
		area = l * b;
	}
}

class Square extends Geometry {
	double l;

	@Override
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter l : ");
		l = sc.nextDouble();
	}

	@Override
	void calcArea() {
		System.out.println("Area of Square");
		area = l * l;
	}
}

class Circle extends Geometry {
	double r;

	@Override
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		r = sc.nextDouble();
	}

	@Override
	void calcArea() {
		System.out.println("Area of Circle");
		area = 3.14 * r * r;
	}
}

class Shape {
	void allowGeometry(Geometry ref) {
		ref.input();
		ref.calcArea();
		ref.disp();
	}
}
public class GeometryApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s = new Shape();
		System.out.println("Enter one number to find area of geometry");
		System.out.println("Enter 1 - Area of triangle");
		System.out.println("Enter 2 - Area of Rectangle");
		System.out.println("Enter 3 - Area of Square");
		System.out.println("Enter 4 - Area of Circle");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Triangle t = new Triangle();
			s.allowGeometry(t);
			break;
		case 2:
			Rectangle r = new Rectangle();
			s.allowGeometry(r);
			break;
		case 3:
			Square s1 = new Square();
			s.allowGeometry(s1);
			break;
		case 4:
			Circle c = new Circle();
			s.allowGeometry(c);
			break;
		}
	}
}
