package controlstructures;

public class NumberPattern {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int r = 1; r<=n; r++) { // row
			for (int c = 1; c<=r;c++)
				System.out.print(c);
			System.out.println(); //printing new line
		}

	}

}
/*
 * 5
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * Nested Loop
 * 	for (<initial_value;<condition>;<updation>){
 * 		for (<initial_value>;<condition>;<updation>){
 * 				<statements>
 * 		}
 * }
 * Example
 * * 	for (int i = 1; i<=10; i++){
 * 			System.out.println("Testing");
 * 			for (int j = 1; j<=10; j++)
 * 				System.out.println("Test2");
 *
 * }
 * 
 * 
 * 
 * */
