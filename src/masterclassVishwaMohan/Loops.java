package masterclassVishwaMohan;

public class Loops {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) { // Outer Loop

			for (int j = 0; j <= i; j++) { // Inner Loop. Print star i+1 times
				System.out.print("*");
			}

			System.out.println();
		}
	}

}

/**
 Output
 
 *
 **
 ***
 ****
 *****
 
**/