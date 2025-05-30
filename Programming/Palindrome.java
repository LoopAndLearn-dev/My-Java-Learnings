public class Palindrome {
	public static int reverse(int num) {
		int res = 0;
		while (num > 0) {
			int rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		for (int y = 1; y <= 10000; y++) {
			int num = y;
			int res = reverse(num);
			if (num == res) {
				System.out.println(num);
			}
		}
	}
}
