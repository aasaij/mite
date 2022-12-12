package switchdemo;
public class DayOfDate {
	public static void main(String[] args) {
		String sdate = new java.util.Scanner(System.in).nextLine();
		String str[] = sdate.split("/");
		int dd = Integer.parseInt(str[0]);
		int mm = Integer.parseInt(str[1]);
		int yy = Integer.parseInt(str[2]);
		int D, C, f;
		if (mm == 1 || mm == 2) {
			mm+=10;
			yy--;
		}
		else 
			mm-=2;
		D = yy % 100;
		C = yy / 100;
		
		f = (dd + (13*mm-1)/5 + D + D/4 + C/4 - 2*C)%7;
		if (f < 0)
			f+=7;
		switch(f) {
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		}
	}

}
