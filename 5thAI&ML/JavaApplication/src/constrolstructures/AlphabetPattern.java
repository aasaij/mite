package constrolstructures;

public class AlphabetPattern {

	public static void main(String[] args) {
		int len = new java.util.Scanner(System.in).nextInt();
		String str = "";
		for (int i = 1; i<=len; i++)
			str+=(char)(64+i);
		for (int i = 1; i<=len; i++)
			System.out.printf("%-"+len+"."+i+"s%"+len+"."+i+"s\n", str, str);


	}

}
