package Ex1;

abstract public class Plane {
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}

class Cargo extends Plane {
@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("CargoPlane takeoff");
	}
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("CargoPlane flying");
	}
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("CargoPlane landing");
	}
}

class Fighter extends Plane {
	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("FIghter Plane takeOff");
	}
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Plane flying");
	}
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Plane landing");
	}
}

class Passenger extends Plane {
	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Passenger plane takeOff");
	}
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Passenger plane flying");
	}
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Passenger plane landing");
	}
}
class Airport {
	void allowPlane(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class PlaneApp {
	public static void main(String[] args) {
		Cargo c = new Cargo();
		Fighter f = new Fighter();
		Passenger p = new Passenger();
		Airport a = new Airport();
		a.allowPlane(c);
		System.out.println();
		a.allowPlane(f);
		System.out.println();
		a.allowPlane(p);
	}
}
