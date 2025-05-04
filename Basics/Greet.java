//-------Transfer statements
                   //----break, continue, try-catch, return
package number;
public class Greet {
	public static void main(String[] args) {
    
//BREAK - stops the execution and comes out of the loop
		for(int i=0; i<10; i++) {
			if(i==3) {
				break;
			}
			System.out.println("Good Morning "+i );
		}
		System.out.println();
		
//CONTINUE - skips the current iteration and continue the rest of iteration normally
		int j;
		for(j=0; j<10; j++) {
			if(j==5) {
				continue;
			}
			System.out.println("Good Night "+j);
		}
  }
}
