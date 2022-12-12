package constrolstructures;

public class BoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; //primitive type
		Integer aObj = a; //Boxing -- Autoboxing
		int b = aObj; // Unboxing
		System.out.println(b);
		System.out.println(aObj);

	}

}

/*
 * Primitive types			Object Type - Wrapper - java.lang
 * byte						Byte
 * short					Short
 * int						Integer
 * long						Long
 * 
 * float					Float
 * double					Double
 * 
 * char						Character
 * boolean					Boolean
 */
