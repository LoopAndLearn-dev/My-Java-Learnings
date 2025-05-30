public class Prime {
	public static boolean check_prime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

  public static void main(String[] args) {
		for (int k = 2; k <= 100; k++) {
			int num = k;
			boolean res = check_prime(num);
			if (res == true) {
				System.out.println(num);
			}
		}
	}
}
