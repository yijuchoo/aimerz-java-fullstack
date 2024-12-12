package conditionalStatements;

public class ElseIfStatement {

	public static void main(String[] args) {

		int age = 60;

		if (age >= 18 && age <= 59) {

			System.out.println("Allowed to enter");

		} else if (age >= 60) {

			System.out.println("On case by case basis");

		} else {

			System.out.println("Not allowed to enter");

		}
	}
}
