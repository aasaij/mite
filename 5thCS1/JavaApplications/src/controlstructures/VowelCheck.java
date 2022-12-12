package controlstructures;

public class VowelCheck {

	public static void main(String[] args) {
		char ch = new java.util.Scanner(System.in).next().charAt(0);
		System.out.println("aeiouAEIOU".
				            contains(""+ch)?"Vowel":"Not Vowel");
	}

}
