package coll_inbuilt_methods;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		Collections.addAll(a, 10,20,30,10,10,90,100,50,70);
		System.out.println(a);                             //[10, 20, 30, 10, 10, 90, 100, 50, 70]
		System.out.println(Collections.max(a));            //100
		System.out.println(Collections.min(a));            //10
		System.out.println(Collections.frequency(a, 10));  //3(10 has 3 times)
		Collections.replaceAll(a, 10, 999);
		System.out.println(a);                             //[999, 20, 30, 999, 999, 90, 100, 50, 70]
		Collections.reverse(a);
		System.out.println(a);                             //[70, 50, 100, 90, 999, 999, 30, 20, 999]
		Collections.swap(a,1,2);
		System.out.println(a);                             //[70, (100, 50), 90, 999, 999, 30, 20, 999] swap
	}
}
