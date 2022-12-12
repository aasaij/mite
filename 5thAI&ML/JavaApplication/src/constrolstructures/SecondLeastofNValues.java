package constrolstructures;

import java.util.Scanner;

public class SecondLeastofNValues {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size, min, smin;
		size = in.nextInt();
		min =in.nextInt();	
		smin = in.nextInt();
		//Swapping min & smin if min > smin
		if (min > smin) min = (min + smin) - (smin = min);
			//x = (x+y) - (y=x)
		for (int i = 3; i<=size; i++) {
			int x = in.nextInt();
			if ( min > x) {
				smin = min;
				min = x;
			}
			else if (smin > x && x > min && min == smin)
				smin = x;
		}
		System.out.println("Second Min : " + smin);
	}

}
