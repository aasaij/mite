package controlstructures;

import java.util.Scanner;

public class IncreasingOrder2 {

	public static void main(String[] args) {
		int a,b,c,d, max, min, mid;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		max = a > b && a>c ?a:(b >c?b:c);
		min =  a < b && a<c ?a:(b <c ?b:c);
		mid = a+b+c - (max+min);
		
		//Logic - 1
		if ( d < min)
			System.out.println(d+" < " + min + " < " + mid + " < " + max);
		else if (d < mid)
			System.out.println( min + " < " + d + " < "+ mid + " < " + max);
		else if (d < max)
			System.out.println( min + " < " +  mid + " < " +d + " < "+ max);
		else
			System.out.println( min + " < " +  mid + " < "+ max + " < " + d);
	}

}
