package conditionalStatements;

public class IfElseStatement {

	public static void main(String[] args) {

		int age = 16;

		if (age >= 18) {

			System.out.println("Allowed to enter");

		} else {

			System.out.println("Not allowed to enter");

		}
		
		
		// If is only 1 condition, can write without curly brackets{}
//		if (age >= 18)
//			System.out.println("Is an adult");
//		else
//			System.out.println("Still underage");
	}
}
