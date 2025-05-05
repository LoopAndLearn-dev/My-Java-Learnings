//Mutable String
//Whose values are changed even after intialization --- String Buffer && String Builder

package rules;
public class Mutable {
	public static void main(String[] args) {
		
//we cannot done by concat(),
		/*
		String s = new String("Chota Bheem"); //Chota Bheem
		s.concat = ("Dholakpur");
		System.out.println(s);*/
		
//String Buffer
		StringBuffer sb1 = new StringBuffer("Chota Bheem");
		sb1.append(" Dholakpur");
		System.out.println(sb1);
		System.out.println();
		
//String Builder
		StringBuilder sb2 = new StringBuilder("Chota Bheem");
		sb2.append(" Dholakpur");
		System.out.println(sb2);
	}
}
