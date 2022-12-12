package controlstructures;

public class NumberPattern {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int r = 1; r<=n; r++) { // number of rows
			for (int c = 1; c<=r;c++) //number of columns
				System.out.print(c);
			System.out.println(); // new line
		}
	}
}
/*
 * Input : 5
 * Output:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */


// 11, 20, 30,38 - absent 