package methods;

public class MethodDemo {

	/*
	 * static public void main (String args[]) { System.out.println("Hello"); }
	 */

	// static keyword can be in front of public, [] can be after args
	static public void main(String... args) { // ... (3 dots) = spread operator
		System.out.println("Hello");

		for (String arg : args) { // Added in Args in Run Configuration:
									// 100,ai,java
									// if there's space after each comma, it
									// will go to the next line (print vertically) else it will print horizontally
			System.out.println(arg);
		}
	}
}
