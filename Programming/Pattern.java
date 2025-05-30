package pattenpp;

public class Stars {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}
			for (int j = 1; j < rows; j++) {
				System.out.print(" " + " ");
			}
			System.out.println();
		}
		for (int m = 1; m < rows; m++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= rows - m; j++) {
				System.out.print("*" + " ");
			}
			for (int j = 1; j <= rows - m - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
