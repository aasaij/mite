package controlstructures;

public class AlphabetPattern {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int r = 1; r<=n; r++) { // row
			for (int c = 1; c<=r;c++)
				System.out.print((char)(c+64));   // 64 + c ==> ASCII value
			System.out.println(); //printing new line
		}

	}

}

