package controlstructures;

public class NumberPattern2 {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int r = n; r>=1; r--) { // number of rows
//			for (int c=1;c<=n-r; c++)
//				System.out.print(" ");
			if (n-r!=0)
				System.out.printf("%"+(n-r)+"s", " ");
			for (int c = 1; c<=r;c++) //number of columns
				System.out.print(c);
			System.out.println(); // new line
		}

	}

}
/*
 * input : 5
 * Output:
 *     1
 *    12
 *   123
 *  1234
 * 12345

 */