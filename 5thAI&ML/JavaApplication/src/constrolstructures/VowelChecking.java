package constrolstructures;

public class VowelChecking {

	public static void main(String[] args) throws java.io.IOException {
		char ch;
		ch = (char)System.in.read();
//		switch(ch) {
//		case 'a': case 'e': case 'i': case 'o': case 'u':
//		case 'A': case 'E': case 'I': case 'O': case 'U':
//			System.out.println("Vowel");
//			break;
//		default:
//			System.out.println("Not Vowel");
//		}
//		System.out.println("aeiouAEIOU".contains(""+ch)?"Vowel":"Not Vowel");
		System.out.println(Character.isLetter(ch) && !"aeiouAEIOU".contains(""+ch)?"Consonant":"Not Consonant");

	}

}
//10 12 11
//
//10 < 11 < 12