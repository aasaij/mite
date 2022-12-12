package controlstructures;

import java.util.Scanner;

public class DayOfDate {

	public static void main(String[] args) {
		int dd, mm, yy,D, C;
		Scanner in = new Scanner(System.in);
		dd = in.nextInt();
		mm = in.nextInt();
		yy = in.nextInt();
		if (mm == 1 || mm == 2) {
			mm = mm+10;
			yy--;
		}
		else
			mm-=2; // mm = mm - 2
		D = yy % 100;
		C = yy / 100; // 2022 / 100 ==> 20
		int f =(int)( dd + Math.floor((13*mm-1)/5) + D + Math.floor(D/4) + Math.floor(C/4) - 2*C)%7;
		System.out.println(f);
		if (f < 0)
			f+=7;
		switch(f) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
		}
		in.close();
	}
	
}
