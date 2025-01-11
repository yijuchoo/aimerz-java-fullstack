package methods;

class Calculator2 {

	public void add(int x, int y) {
		System.out.println("Sum of " + x + " + " + y + " = " + (x + y));
	}

	/*
	 * To handle double or float values, you need to overload the method to
	 * include these parameter types.
	 */
	public void add(double x, double y) {
		System.out.println("Sum of " + x + " + " + y + " = " + (x + y));
	}

}

public class TypePromotion {

	public static void main(String[] args) {

		Calculator2 c = new Calculator2();
		c.add(10, 20);

		/*
		 * characters 'A' and 'B' have integer values (ASCII codes 65 and 66,
		 * respectively) Java automatically promotes char to int during the
		 * method call. This is valid because int is capable of representing all
		 * char values without data loss.
		 */
		c.add('A', 'B');

		/*
		 * Java does not automatically convert double or float to int because
		 * this conversion would result in a loss of precision (truncating the
		 * fractional part). Java only performs widening conversions (e.g., int
		 * → long or float → double) automatically. However, converting from
		 * double to int is a narrowing conversion and requires an explicit cast
		 */
		c.add(24.5, 13.5);
	}

}