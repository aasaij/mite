package controlstructures;

import java.util.StringTokenizer;

public class DateValidation {

	public static void main(String[] args) {
		String sdate = new java.util.Scanner(System.in).nextLine(); //Anonymous Object
		StringTokenizer st = new StringTokenizer(sdate, "/-.");
		boolean valid = true;
		int dd = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		int yy = Integer.parseInt(st.nextToken());
		
		if ( dd > 31 || dd < 1 || mm > 12 || mm < 1)
			valid = false;
		else {
			switch(mm) {
			case 4: case 6: case 9: case 11:
				if (dd > 30)
					valid = false;
			break;
			case 2:
				if ((yy%4==0 && yy % 100 !=0 ) || ( yy % 400 == 0)) {
					if (dd > 29)
						valid = false;
				}
				else if (dd > 28) valid = false;
			}
		}
		System.out.println(valid?"Valid":"Invalid");
	}

}
