package conditionalStatements.switchStatements;

public class EnhancedSwitchStatement {

	public static void main(String[] args) {

		int day = 6; // if value is eg. 8, result show an error in exception
		// Exception in thread "main" java.lang.IllegalArgumentException:
		// Invalid Day 8

		String dayOfWeek = switch (day) {
			case 6, 7 -> "Weekend"; // "Weekend" is returned directly
			case 1, 2, 3, 4, 5 -> "Weekday";

			/*
			 * The -> arrow operator "case arrow" eliminates the need for a
			 * break statement to avoid fall-through. Can be used as an
			 * expression (i.e., returning a value directly), enabling
			 * assignment in a single step
			 */
			default -> throw new IllegalArgumentException("Invalid Day " + day);
		};
		System.out.println(dayOfWeek);
	}
}
