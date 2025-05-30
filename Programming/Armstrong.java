public class Armstrong {
	public static int find_arm(int num) {
		int res = 0;
		int digit = find_digit(num);
		while (num > 0) {
			int rem = num % 10;
			res = (int) Math.pow(rem, digit) + res;
			num = num / 10;
		}
		return res;
	}

	public static int find_digit(int num) {
		int digit = 0;
		while (num > 0) {
			num = num / 10;
			digit++;
		}
		return digit;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			int num = i;
			int res = find_arm(num);
			if (num == res) {
				System.out.println(num);
			}
		}
	}
}
