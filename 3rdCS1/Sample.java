public class Testing{
	public static void main(String[] arg){
		int a, b, c;
		a = 10;
		b = a++;
		c = ++a + b++;
		System.out.println(a + " " + b + " " + c );
	}
}