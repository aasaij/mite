package controlstructures;

public class PrimeOrNot {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		//Logic - 1
		if ( n > 0) {
			if (n == 1)
				System.out.println("Neither prime not composite");
			else {
				for (int i = 2; i<=n/2; i++)
					if (n % i == 0) {
						System.out.println("Not Prime");
						return; //System.exit(0);
					}
				System.out.println("Prime");
			}
		}
		else
			System.out.println("Invalid!");

	}

}
