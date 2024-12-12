package operators.bitwiseOperators;

public class NotOperators {

	public static void main(String[] args) {
		// Bitwise NOT Operator (~)
		System.out.println("====== Bitwise NOT Operator (~) ======");
		System.out.println("Binary representation of 5");
		System.out.println(Integer.toBinaryString(5));
		System.out.println(5);

		System.out.println("\n\nBinary representation of -5");
		System.out.println(Integer.toBinaryString(-5));
		System.out.println(-5);

		System.out.println("\n\nBitwise NOT Operator ~");
		/*
		 * Bitwise NOT Operator (~) 
		 * Inverts all the bits of the given number
		 * 
		 * Binary Representation of 5 
		 * 00000000000000000000000000000101
		 * 
		 * Apply the Bitwise NOT Operator (~): 
		 * flips all the bits
		 * 11111111111111111111111111111010
		 * 
		 * Interpret Result (Two's Complement) Invert the Bits
		 * 00000000000000000000000000000101 
		 * Add 1
		 * 00000000000000000000000000000001 
		 * to get result (6)
		 * 00000000000000000000000000000110
		 * 
		 * Since number is negative, result is -6
		 * 
		 */

		System.out.println("Binary representation of ~5");
		System.out.println(Integer.toBinaryString(~5));
		System.out.println(~5);

	}
}
