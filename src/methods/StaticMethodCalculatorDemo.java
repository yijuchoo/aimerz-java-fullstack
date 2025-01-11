package methods;

/* In real time standards, you should not write multiple classes in a single source file. 
 * For every class / interface, you need to create a separate source file
 * 
 * For this demo purpose, to avoid switching between multiple files, we are using multiple classes in one source file
 *  
*/

public class StaticMethodCalculatorDemo {

	// Static Method
	// Create a method
	public static void startCalculator() { // void -> method is not returning
											// any value at this point of time
											// (no return statement)
		System.out.println("Welcome to Java Calculator"); // 4. control comes
															// here to print
	}

	public static void add(int x, int y) {

		System.out.println("\nSum of " + x + " + " + y + " = " + (x + y));
	}

	public static int subtract(int x, int y) {

		int z = y - x;
		return z;
	}

	public static int mul(int x, int y, int z) {

		return x * y * z;
	}

	public static int div(int x, int y) {

		return y / x;
	}

	public static void main(String[] args) { // 1. Control comes to the main
												// method

		System.out.println("main started"); // 2. main method starts
		startCalculator(); // 3. this executes
							// 5a. Comes back to where it
							// came from and continues its execution

		add(10, 20);

		int diff = subtract(10, 20);
		System.out.println("\nSubtract result " + diff);

		System.out.println("\nMultiply result " + mul(10, 20, 30));

		System.out.println("\nDivision result " + div(10, 20));
		
		System.out.println(diff);
		
		main("aimerz");

		System.out.println("\nmain ended"); // 5b. Continues and end here
	}
	
	public static void main(String args) {
		
		System.out.println("\n---main started 2---");
		startCalculator();
		
		add(10, 20);
		
		int diff = subtract(10, 20);
		System.out.println("\nSubtract " + diff);
		
		System.out.println("\nMultiply " + mul(10, 20, 30));
		
		System.out.println("\nDivision " + div(10, 20));
		
		System.out.println("\n---main ended 2---");
	}

}
