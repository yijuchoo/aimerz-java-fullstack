package masterclassVishwaMohan.inheritance;

public class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal {
	public void dance() {
		System.out.println("Dog is dancing");
	}
}
