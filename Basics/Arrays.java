package arrays;
import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {

//1D Array
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		System.out.println(a[0]);
		System.out.println(a[1]);
		a[3] = 30;
		System.out.println(a[3]);
		a[4] = 40;
		System.out.println(a[4]);
		System.out.println(Arrays.toString(a));
		System.out.println();

//2D Array
		int b[][] = new int[3][5];
		b[0][3] = 50;
		b[1][2] = 60;
		b[2][4] = 100;
		System.out.println(b[0][3]);
		System.out.println(b[1][3]);
		System.out.println(b[2][3]);
		System.out.println(b[1][2]);
		System.out.println(b[2][4]);
		System.out.println();
		System.out.println(Arrays.toString(b));
		System.out.println();

//3D Array
		int c[][][] = new int[3][3][5];
		c[0][2][3] = 70;
		c[2][1][4] = 35;
		System.out.println(c[0][2][3]);
		System.out.println(c[2][1][4]);
		System.out.println(Arrays.toString(c));
		System.out.println();

//Jagged Array

		int d[][] = new int[3][];
		d[0] = new int[5];// 5 block created
		d[1] = new int[4];// 4 block created
		d[2] = new int[3];// 3 block created
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		d[1][0] = 60;
		System.out.println(d[1][0]);

	}
}
