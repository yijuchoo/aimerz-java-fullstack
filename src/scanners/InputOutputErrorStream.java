package scanners;

import java.io.IOException;

public class InputOutputErrorStream {

	public static void main(String[] args) throws IOException {

		System.out.println(
				"Standard Output Stream, Input Stream and Error Stream");
		System.out.println(
				"========================================================");
		System.out.println("Hello World");

		/*
		 * The System.in.read() method reads one byte of data from the standard
		 * input stream (System.in), which corresponds to the ASCII value of the
		 * character entered.
		 */
		System.out.println("Enter your input:");
		int x = System.in.read();
		/*
		 * if input is 10, System.in.read() only reads the first byte of the
		 * input (i.e., the character '1'), not the entire number.
		 */

		System.out.println("Value of x is " + x);
		/*
		 * ASCII values are used to represent characters in numeric form. In the
		 * case of the character '1'. The ASCII value of '1' is 49 Output: Value
		 * of x is 49
		 */

		System.out.println("Value of char x is " + (char) x);
		// Converts 49 back to the character '1'

		// Error Stream
		System.err.println("Exception in thread main");
	}

}
