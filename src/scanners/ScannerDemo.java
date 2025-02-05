package scanners;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		/*
		 * In order to use Scanner, we need to create a Scanner Object (using
		 * the 'new' keyword) with the Input Stream (System.in)
		 */
		Scanner scan = new Scanner(System.in);

		// Name (String) ========================
		System.out.println("Enter your name:");

		/*
		 * next() -> If input has a space inside eg. "John Doe" then only "John"
		 * is read
		 */
		String name = scan.next();

		/*
		 * this will remove the buffer (eg. Doe) and not reading anything and
		 * not storing anywhere
		 */
		scan.nextLine();

		System.out.println("Your name is " + name);

		// Fullname (String) ========================
		System.out.println("\nEnter your fullname:");

		/*
		 * nextLine() -> Accepts space inside eg. "John Doe" reads the full line
		 * upon Enter
		 */
		String fullName = scan.nextLine();

		System.out.println("Your fullname is " + fullName);

		// Age (int) ========================
		System.out.println("\nEnter your age:");

		int age = scan.nextInt();

		System.out.println("Your age is " + age);

		// Gender (CharAt) ========================
		System.out.println("\nEnter your gender:");

		// This will read a String but only the first character
		char gender = scan.next().charAt(0);

		System.out.println("Your gender is " + gender);
		
		scan.close();

	}

}
