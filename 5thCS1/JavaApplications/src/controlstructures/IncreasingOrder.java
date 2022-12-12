package controlstructures;

import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y,z, max, min, mid;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		max = x > y && x>z?x:(y>z?y:z);
		min = x < y && x<z?x:(y<z?y:z);
		mid = x+y+z - (max+min);
		
		System.out.println(min +"<"+mid+"<"+max);

	}

}
