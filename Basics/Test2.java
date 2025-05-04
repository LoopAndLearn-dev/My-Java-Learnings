// 2.Iteration Statement
                    //for, while, do-while

//FOR LOOP
package loop;
public class Test {
	public static void main(String[] args) {
    
//for -1
		for(int i=1; i<=5; i++) {
			System.out.println("Hello "+i);
		}
		System.out.println();

//for-2
		//---------instead of intialization it is possible to take statements.
		int i=0;
		for(System.out.println("Rama");i<5;i++) {
			System.out.println("Haii "+i);
		}
		System.out.println();

//for-3
		   //---------if we are not providing **condition** it will represents **infinite loop/execution**.
		for(int k=0;;i++) {
			System.out.println("Thank you...! "+k);
		}

//for-4
	     //--------if **condition=true** it is also representing **infinite execution**.
		for(int k=0; true; k++) {
			System.out.println("Hello"+i);
		}
    
//for-5
	  	//--------if **condition=false** it is representing **error**.
		for(int i=0; false; i++){
			System.out.println("Hi "+i);
		}
    
//for-6
		  //--------if **nothing is provided** it is representing **infinite execution**.
		for(;;) {
			System.out.println("Hello");
		}
	}
}

//WHILE LOOP
            //entry controlled loop
package loop;
public class Test2 {
	public static void main(String[] args) {
//while-1
		int i=0;
		while(i<10) {
			System.out.println("Palace "+i);
			i++;
		}
    
//while-2
		   //------**condition-true** gives **infinite execution**
		int j=0;
		while(true) {
			System.out.println("Palace"+j);
			j++;
		}
    
//while-3
		//------**condition-false**  gives **compilation error**
		int k=0;
		while(false) {
			System.out.println("Palace"+k);
			k++;
		}
	}
}

//DO-WHILE LOOP
            //-----exit controlled loop

package loop;
public class Test3 {
	public static void main(String[] args) {

//do-while-1
	int i=0;
	do {
		System.out.println("Mr.Bean"+i);
		i++;
	}
	while(i<=5);
	System.out.println();

//do-while-2--------**condition=true** gives **Compilation error**
	int j=0;
	do {
		System.out.println("Chota Bheem");
		j++;
	}
	while(true);
	System.out.println("Chutki");*/
	
	
//do-while-3--------**condition=false** gives both oggy jack, bcz first body will execute by default and after come out of the loop , prints rest of all the statements
		int k=0;
		do {
			System.out.println("Oggy");
			k++;
		}
		while(false);
		System.out.println("Jack");
	}

}

