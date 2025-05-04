<<-----------Java User Input/ Scanner Class----------->>
  
package mob;
import java.util.Scanner;

public class Mobile {
	void call() {
		System.out.println("You are getting a call");
	}
	void playMusic() {
		System.out.println("You are playing a music");
	}
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Enter your Mobile Name");
		String Name=sc.nextLine();
    
		System.out.println("Enter the color of the Mobile");
		String Color=sc.nextLine();
    
		System.out.println("Enter the size of Mobile");
		float Size = sc.nextFloat();
		sc.nextLine();
    
		System.out.println("Enter the weight of the Mobile");
		double Weight = sc.nextDouble();
		
		System.out.println("Mobile Name is "+Name);
		System.out.println("Mobile Color is "+Color);
		System.out.println("Size of the Mobile is "+Size);
		System.out.println("Weight of the Mobile is "+Weight);
		
		Mobile m = new Mobile();
		m.call();
		m.playMusic();
	}
}
