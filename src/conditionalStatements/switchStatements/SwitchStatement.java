package conditionalStatements.switchStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		
		String day = "Funday";
		
		System.out.println("What is " + day + "?\n");
		
		switch (day) {
			case "Monday" :System.out.println("Day 1 of the week");
			break;
			case "Tuesday" :System.out.println("Day 2 of the week");
			break;
			case "Wednesday" :System.out.println("Day 3 of the week");
			break;
			case "Thursday" :System.out.println("Day 4 of the week");
			break;
			case "Friday" :System.out.println("Day 5 of the week");
			break;
			case "Saturday" :System.out.println("Day 6 of the week");
			break;
			case "Sunday" :System.out.println("Day 7 of the week");
			
			default : System.out.println("Day doesn't exist");
		}
		
	}
}
