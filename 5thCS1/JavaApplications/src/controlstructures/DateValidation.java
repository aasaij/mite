package controlstructures;

import java.util.StringTokenizer;

public class DateValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sdate = new java.util.Scanner(System.in).nextLine();
		StringTokenizer st = new StringTokenizer(sdate, "/-.");
		int dd = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		int yy = Integer.parseInt(st.nextToken());
		boolean valid = true;
		if (dd > 31 || dd < 1 || mm > 12 || mm <1)
			valid = false;
		else {
			switch(mm) {
			case 4: case 6: case 9: case 11:
				if (dd > 30) valid = false;
				break;
			case 2:
				if ((yy%400 == 0) || (yy%4==0 && yy%100!=0)) {
					if (dd > 29) valid = false;
				}
				else if (dd > 28) valid = false;
			}
		}
		if (valid) {
			int f, D, C;
			if ( mm == 1 || mm == 2) {
				mm+=10;
				yy--;
			}
			else
				mm-=2;
			D = yy % 100;
			C = yy / 100;
			f = f = (int)(dd + Math.floor((13*mm-1)/5) + D + Math.floor(D/4) + Math.floor(C/4)-2*C)%7;
			if (f < 0) f +=7;
			switch(f) {
			case 0:
				System.out.println("Sunday");break;
			case 1:
				System.out.println("Monday");break;
			case 2:
				System.out.println("Tuesday");break;
			case 3:
				System.out.println("Wednesday");break;
			case 4:
				System.out.println("Thursday");break;
			case 5:
				System.out.println("Friday");break;
			case 6:
				System.out.println("Saturday");			
			}
		}
		else
			System.out.println("Invalid");
			
		

	}

}
