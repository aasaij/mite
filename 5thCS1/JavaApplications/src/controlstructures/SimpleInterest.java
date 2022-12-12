package controlstructures;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int principal;
		float rateOfInterest, time,interest;
		System.out.print("Principal Amount : ");
		principal = in.nextInt();
		System.out.print("Rate of Interest : ");
		rateOfInterest = in.nextFloat();
		System.out.print("Time : ");
		time = in.nextFloat();
		interest = principal * time * rateOfInterest / 100;
		System.out.println("Simple Interest : " + interest);
		in.close();

	}

}
