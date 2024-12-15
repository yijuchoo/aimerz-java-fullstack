package conditionalStatements.switchStatements;

public class NestedSwitchStatement {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
		
		String day = "Monday";
		
		switch (day) {
			default: System.out.println("Day doesn't exist");
			break;
			case "Monday" : 
				System.out.println("1st day of the week");
				
				switch (x) {
					case 1 : System.out.println("Hello, x = 1");
					break;
					default: System.out.println("X value doesn't match with 1");
				}
			break;
			
			case "Tuesday" : System.out.println("2nd day of the week");
			break;
			case "Wednesday" : System.out.println("3rd day of the week");
			break;
			case "Thursday" : System.out.println("4th day of the week");
			break;
			case "Friday" : System.out.println("5th day of the week");
			break;
			case "Saturday" : System.out.println("6th day of the week");
			break;
			case "Sunday" : System.out.println("7th day of the week");
			
		}
	}
}
