package com.ex;

public class Plane {
	void takeOff() {
		System.out.println("Plane takeoff");
	}

	void fly() {
		System.out.println("Plane flying");
	}

	void land() {
		System.out.println("Plane landing");
	}
}

class CargoPlane extends Plane {
	void carryCargo() {
		System.out.println("Carrying Cargo...!");
	}
}

class PassengerPlane extends Plane {
	void carryPassenger() {
		System.out.println("Carrying Passengers...!");
	}
}

class FighterPlane extends Plane {
	void carryWeapons() {
		System.out.println("Carrying Weapons....!");
	}
}
package com.ex;

public class PlaneApp {
	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		FighterPlane f = new FighterPlane();
		c.takeOff();
		c.fly();
		c.carryCargo();
		c.land();
		System.out.println();
		p.takeOff();
		p.fly();
		p.carryPassenger();
		p.land();
		System.out.println();
		f.takeOff();
		f.fly();
		f.carryWeapons();
		f.land();
	}
}
