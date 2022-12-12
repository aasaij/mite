package switchdemo;

public class PrimeOrNot {

	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		if ( x > 0) {
			if ( x == 1)
				System.out.println("Neither prime nor composite");
			else if (x > 3 && (x % 2 == 0 || x % 3 == 0))
				System.out.println("Not Prime");
			else {
				for (int f = 5 ; f*f<=x; f+=6)
					if (x % f == 0 || x % ( f + 2)==0) {
						System.out.println("Not Prime");
						return; //System.exit(0);
					}
				System.out.println("Prime");
			}
		}
	}

}
