package masterclassVishwaMohan;

public class Loops3 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i == 0 && (j >= 1 && j <= 3)) || (i >= 1 && j == 0)
						|| i == 2 || (i >= 1 && j == 4)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}

/**
Output (Print "A" pattern)

* * *   
*       * 
* * * * * 
*       * 
*       *
**/ 
