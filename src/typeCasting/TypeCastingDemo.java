package typeCasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// Implicit Type Casting
		// Creating a variable
		byte b = 127;

		/*
		 * Create another variable Assigning int i to b. Taking b (1 byte)
		 * storing it inside int (4 bytes)
		 * 
		 */
		short s = b;
		int i = s;
		System.out.println("=== Implicit Type Casting - Widening ===");
		System.out.println("Converting from Byte to Short");
		System.out.println("b = " + b); // output 127 b is still a byte
										// (determined at
										// the time of declaration)
		System.out.println("s = " + s); // output 127 s is still a short
										// (determined at
										// the time of declaration)
		System.out.println("\nConverting from Short to Integer");
		System.out.println("i = " + i); // output 127

		System.out.println("\nConverting from Char to Integer");
		char c1 = 'B';
		int x = c1;
		System.out.println("c1 = " + c1);
		System.out.println("x = " + x);

		// Explicit Type Casting
		// Creating a variable
		float f = 123.123f;

		System.out.println("\n\n=== Explicit Type Casting - Narrowing ===");
		b = (byte) f; // Forcefully assigning float to byte. This will result to
						// data loss.
		// Float value 123.123 is truncated to its integer part 123, removing
		// the fractional part. Integer value is converted to a byte.

		System.out.println("f = " + f);
		System.out.println("Converting from Float to Byte");
		System.out.println("b = " + b); // output 123. Truncation

		System.out.println("\nConverting from Short to Byte");
		short s1 = 32050;
		// byte b1 = (byte) s1;
		b = (byte) s1;
		System.out.println("s1 = " + s1); // output 32050
		System.out.println("b = " + b); // output 50

		System.out.println("\nConverting from Int to Char");
		int i1 = 65; // 97 is a, 65 is A
		char c = (char) i1;
		System.out.println("i1 = " + i1);
		System.out.println("c = " + c); // 97 is a, 65 is A
	}
}