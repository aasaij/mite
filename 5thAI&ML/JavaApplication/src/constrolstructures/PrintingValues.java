package constrolstructures;

import java.util.Scanner;

public class PrintingValues {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int max, min, mid;
//		max = (a>b && a > c)?a:(b>c?b:c);
		max = Math.max(Math.max(a,b), c);
//		min = (a<b && a < c)?a:(b<c?b:c);
		min = Math.min(Math.min(a,b), c);
		mid = a+b+c - (max+min);
		System.out.println(min + "<" + mid +"<"+max);
	}

}
