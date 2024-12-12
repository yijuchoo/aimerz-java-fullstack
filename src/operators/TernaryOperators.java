package operators;

public class TernaryOperators {

	public static void main(String[] args) {

		int age = 17;
		// (age >= 18) ? ---> If age is greater or equals to 18
		// : ----> else
		boolean allowed = (age >= 18) ? true : false;

		System.out.println(allowed);

		// String Example
		String status = (age >= 18) ? "Allowed" : "Not eligible";
		System.out.println(status);
		
	}
}
