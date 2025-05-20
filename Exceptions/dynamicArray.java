package coll_sa_da;

import java.util.*;

public class dynamicArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector(); //vector already overridden for, to string method, so dont need to use for loop, direct print v
		int i = 0;
		int choice = 1;
		while (choice == 1) {
			System.out.println("Enter an element");
			int y = sc.nextInt();
			v.add(y);           //we can add n no. objects increasing or decreasing during runtime
			System.out.println("Do you wish to continue....?");
			System.out.println("1.Yes");
			System.out.println("2.No");
			choice = sc.nextInt();
		}
		System.out.println("Total Elements :");
		System.out.println(v);
	}
}
