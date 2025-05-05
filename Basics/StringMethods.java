//-----------------------------The 7-Inbuilt Methods in String---------------------------------

package rules;
public class Methods {
	public static void main(String[] args) {
		String s1 = "RajaRamMohanRoy";
		System.out.println(s1);
		System.out.println();

// 1.length()
		System.out.println(s1.length());//15
		System.out.println();
		
// 2.charAt()
		System.out.println(s1.charAt(6));//m
		System.out.println();
		
// 3.indexOf()
		System.out.println(s1.indexOf('o'));//8
		System.out.println();
		
// 4.lastIndexOf()
		System.out.println(s1.lastIndexOf('R'));//12
		System.out.println();
		
// 5.toUppercase()
		System.out.println(s1.toUpperCase());
		System.out.println();
		
// 6.toLowercase()
		System.out.println(s1.toLowerCase());
		System.out.println();
		
// 7.substring(n-1)
		System.out.println(s1.substring(7));//From 7 to end - MohanRoy
		System.out.println();
		System.out.println(s1.substring(4,10));//RamMoh
	}
}
