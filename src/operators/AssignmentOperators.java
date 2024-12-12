package operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		System.out.println("===== Assignment Operators =====");
		System.out.println("= (Assign)");
		System.out.println("+= (Add and Assign)");
		System.out.println("-= (Subtract and Assign)");

		int a = 10;
		int b = 20;

		// Writing a = a + 5 is the same as a += 5
		// a = a + 5;
		// Shortcut way of writing a = a + 5
		a += 5;
		System.out.println("a = 10, b = 20");
		System.out.println("\n\na += 5, is the same as, a = a + 5");
		System.out.println("a = " + a);

		b -= 5; // Same as a = a - 5
		System.out.println("\nb -= 5 is the same as b = b - 5");
		System.out.println("b = " + b);
	}
}
