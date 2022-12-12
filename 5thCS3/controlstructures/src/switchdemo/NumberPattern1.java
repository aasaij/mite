package switchdemo;

public class NumberPattern1 {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int r = 1; r<=n; r++) {
			for (int c = 1; c<=r; c++)
				System.out.print((char)(c+64));
			System.out.println();
		}
		

	}

}
/*
 *Input : 5
 *Output
 *1
 *12
 *123
 *1234
 *12345 
 */
