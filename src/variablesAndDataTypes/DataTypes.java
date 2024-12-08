package variablesAndDataTypes;

// Creating a User-defined Class
class Data {

}

public class DataTypes {

	public static void main(String[] args) {

		System.out.println("============================");
		System.out.println("8 Primitive Data Types");
		System.out.println("============================");
		// 8 Primitive Data Types
		byte age = 12;
		age++; // Increase by 1
		age--; // Decrease by 1
		System.out.println("byte " + age);

		short s = 1000;
		int i = 978998;
		long l = 856787656789l;
		float f = 79889.99598f;
		double d = 8654.9876890;
		char c = 's';
		boolean b = true;

		System.out.println("short " + s);
		System.out.println("int " + i);
		System.out.println("long " + l);
		System.out.println("float " + f);
		System.out.println("double " + d);
		System.out.println("char " + c);
		System.out.println("boolean " + b);

		System.out.println("\n============================");
		System.out.println("Non-Primitive Data Types");
		System.out.println("============================");
		// Non-Primitive Data Types
		String s1 = "aimerz@123";
		System.out.println("string " + s1);

		// User-defined Non-Primitive Data Type
		Data d2 = null; // Creating an object
		System.out.println("User-defined Non-Primitive Data Type " + d2);

		System.out.println("\n============================");
		System.out.println("Wrapper Classes");
		System.out.println("============================");
		// Wrapper Classes
		Byte b1 = 1;
		Short s2 = 5;
		Integer i1 = 7;
		Long l1 = 894l;
		Float f1 = 12.99f;
		Double d1 = 12.22;
		Character c1 = 'A';
		Boolean b2 = false;

		System.out.println("Byte " + b1);
		System.out.println("Short " + s2);
		System.out.println("Integer " + i1);
		System.out.println("Long " + l1);
		System.out.println("Float " + f1);
		System.out.println("Double " + d1);
		System.out.println("Character " + c1);
		System.out.println("Boolean " + b2);
	}
}
