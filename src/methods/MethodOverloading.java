package methods;

class Calculator1 {

	public void add(int x, int y) {

		System.out.println("\nSum of " + x + " + " + y + " = " + (x + y));
	}
	// Compile-time Polymorphism
	
	// Different return type but same method name will not work
	// public int add(int x, int y, int z) {
	//
	// return x + y + z;
	// }

	public void add(int x, int y, int z) {

		System.out.println(
				"\nSum of " + x + " + " + y + " + " + z + " = " + (x + y + z));
	}

	public void add(double x, double y) {

		System.out.println("\nSum of " + x + " + " + y + " = " + (x + y));
	}

	public void add(String x, double y) {

		System.out.println("\nSum of " + x + " + " + y + " = " + (x + y));
	}

	// Test for Overloading in Static Methods
	// Overloading works in static method as well
	public static void add1(int x, int y, int z) {

		System.out.println(
				"\nSum of " + x + " + " + y + " + " + z + " = " + (x + y + z));
	}

	public static void add1(double x, double y) {

		System.out.println("\nSum of " + x + " + " + y + " = " + (x + y));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calculator1 c = new Calculator1();

		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10.5, 20.5);
		c.add("Jane ", 224.5);

	}
	// public static void main(String[] args) {
	// Calculator1 c = new Calculator1();
	//
	// c.add(10, 20);
	// c.add(10, 20, 30);
	// c.add(10.5, 20.5);
	// c.add("Jane", 224.5);
	// }
}
