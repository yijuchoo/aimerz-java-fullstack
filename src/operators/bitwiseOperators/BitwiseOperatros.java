package operators.bitwiseOperators;

public class BitwiseOperatros {

	public static void main(String[] args) {
		// Binary of 5 is 0101
		System.out.println("Binary of 5 = " + Integer.toBinaryString(5));
		// Binary of 3 is 0011
		System.out.println("Binary of 3 = " + Integer.toBinaryString(3));

		System.out.println("\n\nBitwise AND Operator (&)");
		System.out.println("5 & 3 = " + (5 & 3));

		System.out.println("\n\nBitwise OR Operator (|)");
		System.out.println("5 | 3 = " + (5 | 3));

		System.out.println("\n\nBitwise XOR Operator (^)");
		System.out.println("5 ^ 3 = " + (5 ^ 3));

		System.out.println("\n\n-- Bitwise Shift Operators --");
		System.out.println("Left Shift Operator (<<)");
		System.out.println("5 << 1 = " + (5 << 1));

		System.out.println("\nRight Shift Operator (>>)");
		System.out.println("5 >> 1 = " + (5 >> 1));

	}
}
