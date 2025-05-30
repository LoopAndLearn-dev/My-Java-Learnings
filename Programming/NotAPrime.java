import java.util.Scanner;
public class NotAPrime {
	public static boolean check_prime(int n) {
		for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		boolean res = check_prime(n);
		System.out.println(res);
	}
}
