package controlstructures;

public class VowelOrNot {

	public static void main(String[] args) throws java.io.IOException {
		char ch = (char)System.in.read();
//		ch = Character.toLowerCase(ch);
//		if ( ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u')
//			System.out.println("Vowel");
//		else
//			System.out.println("Not Vowel");
//		if ("aeiouAEIOU".contains(""+ch))
//			System.out.println("Vowel");
//		else
//			System.out.println("Not Vowel");
		
		System.out.println("aeiouAEIOU".contains(""+ch)?"Vowel":"Not Vowel");
		
	}

}
