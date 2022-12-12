package constrolstructures;

public class StarPattern {

	public static void main(String[] args) {
		int len = new java.util.Scanner(System.in).nextInt();
		String str = "";
		for (int i = 1; i<=len; i++)
			str+="*";
		for (int i = 1; i<=len; i++)
			System.out.printf("%-"+len+"."+i+"s%"+len+"."+i+"s\n", str, str);

	}

}
