package pattenpp;

public class Number {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 5; j > rows - i; j--) {
				System.out.print(j + " ");
			}
			for (int j = rows - i + 2; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + " ");
			}
			for (int j = rows; j > i; j--) {
				System.out.print(j + " ");
			}
			for (int j = i + 2; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
