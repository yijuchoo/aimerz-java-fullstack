package masterclassVishwaMohan.classObject;

public class App {

	public static void main(String[] args) {

		/* Create the object of Person */
		Person p1 = new Person("Vishwa", 49, "Male");
		p1.introduce();

		Person p2 = new Person("Mohan", 33, "Male");
		p2.introduce();

		Person p3 = new Person("Jane", 20, "Female");
		p3.introduce();
	}
}
