package operators;

public class IncreDecrementOperators {

	public static void main(String[] args) {

		System.out.println("Increment Operators");

		int a = 10;

		System.out.println("\nThis is Post Increment (a++) " + a++);
		System.out.println("After a++, a is now " + a);

		System.out.println("\nThis is Pre Increment (++a) " + ++a);
		System.out.println("After 11 ++a, a is now " + a);

		int b = 20;

		System.out.println("\nThis is Post Decrement (b--) " + b--);
		System.out.println("After b--, b is now " + b);

		System.out.println("\nThis is Pre Decrement (--b) " + --b);
		System.out.println("After 19 --b, b is now " + b);

		// Example 1
		System.out.println("\n\n====== Example 1 ======");
		int c = 10;
		int d = 20;

		int e = c++ + --d + --c + d++;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("c++ + --d + --c + d++ = " + e);

		// Example 2
		System.out.println("\n\n====== Example 2 ======");
		int i = 11;
		i = i++ + ++i;
		System.out.println("i = 11");
		System.out.println("i++ + ++i = " + i);

		// Example 3
		System.out.println("\n\n====== Example 3 ======");
		int x = 0;
		x = x++ - --x + ++x - x--;
		System.out.println("x++ - --x + ++x - x-- = " + x);

		// Example 4
		System.out.println("\n\n====== Example 4 (Compilation Error) ======");
		int y = 11;
		// int z = --(y++); // Compilation error
		System.out.println(
				"int z = --(y++); will get a compilation error as its pre and post operation at the same time");

	}

}
