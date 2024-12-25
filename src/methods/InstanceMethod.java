package methods;

class Calculator {
	public void startCalculator() {

		System.out.println("Welcome to Java Calculator");
	}

	public void add(int x, int y) {

		System.out.println("\nSum of " + x + " + " + y + " = " + (x + y));
	}

	public int subtract(int x, int y) {

		int z = y - x;
		return z;
	}

	public int mul(int x, int y, int z) {

		return x * y * z;
	}

	public int div(int x, int y) {

		return y / x;
	}
}

public class InstanceMethod {

	public static void main(String[] args) {

		/*
		 * Create an Object -> new Calculator(); Create a reference to the
		 * Object -> Calculator c
		 */
		Calculator c = new Calculator();

		System.out.println("main started");
		c.startCalculator();

		c.add(10, 20);

		int diff = c.subtract(10, 20);
		System.out.println("\nSubtract result " + diff);

		System.out.println("\nMultiply result " + c.mul(10, 20, 30));

		System.out.println("\nDivision result " + c.div(10, 20));

		System.out.println("\nmain ended");
	}
}
