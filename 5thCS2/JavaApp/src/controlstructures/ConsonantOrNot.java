package controlstructures;

public class ConsonantOrNot {

	public static void main(String[] args) {

		char ch = new java.util.Scanner(System.in).next().charAt(0);
//		if (( ch >='a' && ch <='z') || (ch>='A' && ch <='Z'))
		if (Character.isLetter(ch) && !"aeiouAEIOU".contains(""+ch))
			System.out.println("Consonant");
		else
			System.out.println("Not Consonant");

	}

}
