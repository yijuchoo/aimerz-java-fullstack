package beans;

public class Car {

	// Beans = public class, private variables, getters and setters, constructors

	private String name;
	private int engineCapacity;

	// Getters Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	// Constructors
	public Car(String name, int engineCapacity) {
		super();
		this.name = name;
		this.engineCapacity = engineCapacity;
	}

}
