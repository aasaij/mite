package controlstructures;

import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		int a, b, c, max, min, mid;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		//Version - 1
//		max = a > b && a > c ? a : ( b > c ?b : c);
//		min = a < b && a < c ? a : ( b < c ?b : c);
//		mid = a + b + c - (max + min);
		//Version 2
		max = Math.max(Math.max(a, b), c);
		min = Math.min(Math.min(a, b), c);
		mid = a + b + c - (max + min);
		System.out.println(min + " < " + mid + " < " + max );

	}

}
