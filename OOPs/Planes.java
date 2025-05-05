package com.runtimepoly;

public class Planes {
	void land() {
		System.out.println("Plane landed");
	}
}

class CargoPlane extends Planes {
	@Override
	void land() {
		System.out.println("Cargo Plane landed");
	}
}

class PassengerPlane extends Planes {
	@Override
	void land() {
		System.out.println("Passenger Plane landed");
	}
}

class FighterPlane extends Planes {
	@Override
	void land() {
		System.out.println("Fighter Plane landed");
	}
}

class Airport {
	void allowPlane(Planes ref) {
		ref.land();
	}
}

class PlaneApp {
	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		FighterPlane f = new FighterPlane();
		Airport a = new Airport();
		a.allowPlane(c);
		a.allowPlane(p);
		a.allowPlane(f);
	}
}
