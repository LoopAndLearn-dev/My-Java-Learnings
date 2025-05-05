//TYPECASTING
                  //1. Upcasting   //2.Downcasting
package typecasting;
public class Plane {
	void land() {
		System.out.println("Plane is landing");
	}
}

class FighterPlane extends Plane {
	@Override
	void land() {
		System.out.println("Fighter Plane is landing");
	}

	void launchMissile() {
		System.out.println("Missile launched");
	}
}
package typecasting;

public class Demo {
	public static void main(String[] args) {
		FighterPlane f = new FighterPlane();
		Plane ref;
		ref = f; // Upcasting
		ref.land();
		((FighterPlane) ref).launchMissile(); // Downcasting
	}
}
