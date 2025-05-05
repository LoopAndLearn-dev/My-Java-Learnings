//STRINGS 
        //2 types - Immmutable Strings, Mutable Strings

//Immutable String
//------------------8 rules of string
package rules;
public class StringRules {
	public static void main(String[] args) {

//-----1.Access the data not the address
		String s1, s2;
		s1 = "Rama";
		s2 = s1;
		System.out.println(s1); // Rama
		System.out.println(s2); // Rama
		System.out.println();

//-----2.To compare the contents of the given two strings - **.equals()**
		String s3, s4;
		s3 = "Rama";
		s4 = "Rama";
		if (s3.equals(s4)) {
			System.out.println("Contents are same");
		} else {
			System.out.println("Contents are different");
		}
		System.out.println();

//-----3.To compare the references or address of two strings - **==**
		String s5, s6;
		s5 = "Rama";
		s6 = "Sita";
		if (s5 == s6) {
			System.out.println("Addresses are same");
		} else {
			System.out.println("Addresses are different");
		}
		System.out.println();

//-----4.If strings are declared **without new operator**, memory is allocated in **constant pool**

//-----5.**Duplicates are not** allowed in **constant pool**
		String s7 = "Krishna";
		String s8 = "Arjuna";
		String s9 = "Krishna";
		String s10 = "Krishna";
		if (s9 == s10) {
			System.out.println("Both addresses are pointing to same object");
		} else {
			System.out.println("Both addresses are not pointing to same object");
		}
		System.out.println();

//-----6.If strings declared **with new operator**, memory is allocated in **non-constant pool**

//-----7.**Duplicates** are allowed in **non-constant pool**

		String s11 = new String("Ravana");
		String s12 = new String("Ravana");
		if (s11 == s12) {
			System.out.println("Both addresses are pointing to same object");
		} else {
			System.out.println("Both addresses are not pointing to same object");
		}
		System.out.println();

//-----8.The "+" operator is used to **concatenate any two strings**
       //->During concatenation, if only used **values == constant pool
		
	    String s13,s14;
	    s13="Rama"+"Sita";
	    System.out.println(s13); //RamaSita
	    s14="Rama"+"Sita";
	    System.out.println(s14);//RamaSita
	    if(s13==s14) {
	    	System.out.println("Both are pointing to same object");
	    }else {
	    	System.out.println("Both are not pointing to same object");
	    }
	    System.out.println();
	    
	  //->During concatenation, if only used **variable == non-consatnt pool
	    
	    String s15,s16;
	    s15="Rama";
	    s16="Sita";
	    String s17,s18;
	    s17=s15+s16;
	    System.out.println(s17);
	    s18=s15+s16;
	    System.out.println(s18);
	    if(s17==s18) {
	    	System.out.println("Both are pointing to same object");
	    }else {
	    	System.out.println("Both are not pointing to same object");
	    }
	    System.out.println();
	  
	}
}
