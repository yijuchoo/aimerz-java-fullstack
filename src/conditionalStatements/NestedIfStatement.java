package conditionalStatements;

public class NestedIfStatement {

	public static void main(String[] args) {

		int age = 30;
		
		if (age >= 18 && age <= 59) {

			if (age >= 20 && age <= 30) { // Nested If Statement

				System.out.println("Person of 20 - 30 years old");
			}
			System.out.println("Allowed to enter");

		} else if (age >= 60) {

			System.out.println("On case by case basis");

		} else {

			System.out.println("Not allowed to enter");

		}
	}
}
