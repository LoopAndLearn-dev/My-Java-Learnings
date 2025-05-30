public class Binary {
	public static void main(String[] args) {
		int rows = 5;
		int k = 0;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (k == 1) {
					System.out.print(0 + " ");
					k = 0;
				} else {
					System.out.print(1 + " ");
					k = 1;
				}
			}
			System.out.println();
		}
	}
}
