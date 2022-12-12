package controlstructures;

import java.util.Scanner;

public class MaxOfN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int max = in.nextInt();
		for (int i = 2; i<=size; i++) {
			int x = in.nextInt();
			if ( max < x) max = x;
		}
		System.out.println("Maximum : " + max);
	}

}
