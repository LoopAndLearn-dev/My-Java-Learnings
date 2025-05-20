package hashmap;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		LinkedHashMap l = new LinkedHashMap();
		TreeMap t = new TreeMap();
		h.put(100, "John,18,768675,America");
		h.put(200, "Richard,20,888,UK");
		h.put(400, "Smith,30,76865,California");
		h.put(300, "Michael,65,766576,Paris");
		System.out.println("HashMap - random order"); // prints in random order
		System.out.println(h);
		System.out.println();
    
		l.put(100, "John,18,768675,America");
		l.put(200, "Richard,20,888,UK");
		l.put(400, "Smith,30,76865,California");
		l.put(300, "Michael,65,766576,Paris");
		System.out.println("Linked HashMap - insertion order"); // prints in insertion order
		System.out.println(l);
		System.out.println();
    
		t.put(100, "John,18,768675,America");
		t.put(200, "Richard,20,888,UK");
		t.put(400, "Smith,30,76865,California");
		t.put(300, "Michael,65,766576,Paris");
		System.out.println("TreeMap - sorted manner"); // prints in insertion order
		System.out.println(t);
	}
}
