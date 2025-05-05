package com.ex;

public class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}

	void sleep() {
		System.out.println("Animal is Sleeping");
	}

	void breath() {
		System.out.println("Animal is breathing");
	}
}

class Tiger extends Animal {
	@Override
	void eat() {
		System.out.println("Tiger hunts and eat...!");
	}
}

class Deer extends Animal {
	@Override
	void eat() {
		System.out.println("Deer graze and eat...!");
	}
}

class Monkey extends Animal {
  @Override
	void eat() {
		System.out.println("Monkey steals and eat...!");
	}
}

package com.ex;
public class AnimalApp {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();
		t.eat();
		t.sleep();
		t.breath();
		System.out.println();
		d.eat();
		d.sleep();
		d.breath();
		System.out.println();
		m.eat();
		m.sleep();
		m.breath();
	}
}
