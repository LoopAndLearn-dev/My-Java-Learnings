<<---------Object creation in JAVA--------->>
  
package object;
public class Ball {
	String Name;
	int Price;
	public static void main(String[] args) {
		Ball b = new Ball();
		b.Name  = "Wilson";
		b.Price = 120;
		System.out.println(b.Name+" Ball");
		System.out.println("And the price of the Ball is "+b.Price);
	}
}

