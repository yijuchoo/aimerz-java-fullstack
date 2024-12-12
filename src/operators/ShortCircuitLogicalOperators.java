package operators;

public class ShortCircuitLogicalOperators {
	
	public static void main(String[] args) {
		
		System.out.println("-- Short Circuit Logical Operators --");
		System.out.println("Logical AND (&&) Operator");
		System.out.println("true && true = " + (true && true));

		System.out.println("\nLogical OR  (||) Operator");
		System.out.println("true || true = " + (true || true));

		System.out.println("\nLogical NOT (!) Operator");
		System.out.println("!true = " + (!true));

		// Example
		System.out.println("\n\nExample");
		int age = 18;
		int height = 5; // if height is 6, then results is true

		System.out.println("Age = " + age + ", Height = " + height);
		System.out.println("Check that age is 18 and above AND height is 6");
		System.out.println(age >= 18 && height == 6);

		System.out.println("\nCheck that age is 18 and above OR height is 6");
		System.out.println(age >= 18 || height == 6);

		System.out.println("\nCheck that age is NOT 18 and above");
		System.out.println(!(age >= 18));
	}
}
