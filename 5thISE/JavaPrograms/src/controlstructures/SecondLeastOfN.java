package controlstructures;

import java.util.Scanner;

public class SecondLeastOfN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Number of elements
		int size = in.nextInt();
		int min, smin;
		min = smin = Integer.MAX_VALUE;
		for (int i = 1; i<=size; i++) { 																	
			int x = in.nextInt();
			if ( x < min) {
				smin = min;
				min = x;
			}
			else if (x < smin && x > min)
				smin = x;
		}
		System.out.println("Second Minimum : "+smin);

	}

}
