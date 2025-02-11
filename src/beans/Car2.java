package beans;

public class Car2 {

	// Car class has a dependency engine (Car class depends on engine object)
	private Engine engine;

	// Ways to inject dependency into Car object
	// Constructors
	public Car2(Engine engine) {
		super();
		this.engine = engine;
	}

	// Empty Constructor
	public Car2() {

	}

	// Getters and Setters
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
