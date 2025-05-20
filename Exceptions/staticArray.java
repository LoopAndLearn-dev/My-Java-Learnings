package coll_sa_da;

import java.util.*;

public class staticArray {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int choice = 1;
		while (choice == 1) {
			System.out.println("Enter an element");
			a[i] = sc.nextInt();
			i++;
			System.out.println("Do you wish to continue...?");
			System.out.println("1.Yes");
			System.out.println("2.No");
			choice = sc.nextInt();
		}
		System.out.println("Total elements : ");
		
		/*for (int i1 = 0; i1 < a.length - 1; i1++) {
			System.out.println(a[i1]);
		}*/
		
		System.out.println(Arrays.toString(a));
	}
}
