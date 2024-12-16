package loops;

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) { // Outer Loop

			for (int j = 0; j < 5; j++) { // Inner Loop
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("\n"); // Divider

		// Incrementing Star Example
		for (int i = 0; i < 5; i++) { // Outer Loop

			for (int j = 0; j <= i; j++) { // Inner Loop. Incrementing from 0 to
											// 5
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("\n"); // Divider

		// Decrementing Star Example
		for (int i = 0; i < 5; i++) { // Outer Loop. Controls the number of rows
										// printed

			for (int j = 4; j >= i; j--) { // Inner Loop. Decrementing from 4 to
											// 0
				// j = 4, 3, 2, 1, 0 (total: 5 iterations)j = 4, 3, 2, 1, 0
				// (total: 5 iterations)
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
