//Two way Comparision   --->   equals()
//Three way comparision --->   compareTo()

package rules;
import java.util.Scanner;
public class CompareToDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.print("Enter first string : ");
		s1=sc.next();
		System.out.print("Enter second string : ");
		s2=sc.next();
		int res = s1.compareTo(s2);
		if(res==0) {
			System.out.println("s1 and s2 are equal");
		}else if(res>0){
			System.out.println("s1 is greater than s2");
		}else {
			System.out.println("s1 is lesser than s2");
		}
	}
}
