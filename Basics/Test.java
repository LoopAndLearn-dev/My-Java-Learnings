/*....There are 3 types of loops
         1.Selection Statements  2.Iteration Statements  3.Transfer Statements....*/

//Selection Statements 
                      //--if, if-else, else-if, switch
package loop;
public class Test {
	public static void main(String[] args) {
		int a=15;		
//if
	    if(a>4) {
	    	System.out.println("true body");
	    }
	    System.out.println();
//if-else
	    if(a<1) {
	    	System.out.println("Lesser");
	    }else {
	    	System.out.println("Greater");
	    }
	    System.out.println();
//else-if
	    int b = 25;
	    if(a<b) {
	    	System.out.println("A is smaller than B");
	    }else if(a==b) {
	    	System.out.println("A is equal to B");
	    }else {
	    	System.out.println("A is greater than B");
	    }
	    System.out.println();
//switch
	    int c = 30;
	    switch(c) {
	    case 10 : System.out.println("Rama");
	    break;
	    case 20 : System.out.println("Sita");
	    break;
	    default : System.out.println("Ravana");
	    break;
	    }
	}
}
