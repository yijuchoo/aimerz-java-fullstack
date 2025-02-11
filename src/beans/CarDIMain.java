package beans;

public class CarDIMain {

	public static void main(String[] args) {

		// 2 ways to perform dependency injection

		/*
		 * Method 1: Constructor Dependency Injection Pass the engine object to
		 * the constructor of the Car object
		 */

		// create engine object with capacity
		Engine e = new Engine(999);

		// create object of car class
		Car2 c = new Car2(e); // Constructor Dependency Injection DI

		//----------------------------------------------------
		// Method 2: Setter Injection

		Car2 c2 = new Car2();
		c2.setEngine(e); // Setter Dependency Injection DI 
	}

}
