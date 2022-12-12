package controlstructures;

import java.util.Scanner;

public class IncreasingOrderVersion2 {

	public static void main(String[] args) {
		int a, b, c,d, max, min, mid1, mid2;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		max = a > b && a > c && a > d ? a : (b > c && b > d)?b:(c>d?c:d);
		min = a < b && a < c && a < d ? a : (b < c && b < d)?b:(c<d?c:d);
		mid1 = Math.min(Math.max(a, b), Math.max(c, d));
		mid2 = a + b + c + d - (max + min + mid1);
		//mid2 = Math.max(Math.min(a,b), Math.min(c,d))
		if (mid1 < mid2)
			System.out.println(min + " < " + mid1 + " < " + mid2 + " < " + max);
		else
			System.out.println(min + " < " + mid2 + " < " + mid1 + " < " + max);
		
	}

}
