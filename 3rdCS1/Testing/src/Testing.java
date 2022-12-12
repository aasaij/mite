
public class Testing {
	public static void main(String[] arg){
		int a, b, c;
		a = 7;
		b = ++a;
		c = a-- + --b;
		System.out.println(a + " " + b + " " + c );
	}
}
/*
 *	6 7 14
 *	7 7 15 
 */
