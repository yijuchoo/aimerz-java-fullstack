package conditionalStatements.switchStatements;

public class SwitchStatement2 {

	public static void main(String[] args) {

		int x = 3;
		int y = 4;

		// Name of variable being switched
		String variableName = "x";

		switch (x) {
			case 1 :
				System.out.println("Hello");
				break;
			case 2 :
				System.out.println("Matched " + variableName + " = 2");
				break;
			case 3 :
				System.out.println("Matched " + variableName + " = 3");
				break;
			case 4 :
				System.out.println("Matched " + variableName + " = 4");
				break;

			default :
				System.out.println("Nothing matches for " + variableName);
		}

		// Now switch using 'y' for demonstration
		/*
		 * variableName is Mutable You can reassign variableName as many times
		 * as needed. value of variableName changes before each switch block to
		 * indicate which variable is being used in the current block. x and y
		 * are integer variables holding numerical values. variableName is a
		 * String variable that holds textual information.
		 * Using a single String variable (variableName) avoids repetition.
		 * same variableName is reused for both x and y to reduce redundancy.
		 */

		variableName = "y";

		switch (y) {
			case 1 :
				System.out.println("Hello");
				break;
			case 2 :
				System.out.println("Matched " + variableName + " = 2");
				break;
			case 3 :
				System.out.println("Matched " + variableName + " = 3");
				break;
			case 4 :
				System.out.println("Matched " + variableName + " = 4");
				break;

			default :
				System.out.println("Nothing matches for " + variableName);
		}
	}
}
