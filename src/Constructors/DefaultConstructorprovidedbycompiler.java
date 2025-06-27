package Constructors;

// Class name: DefaultConstructorprovidedbycompiler
// This class has instance variables, a display method, and uses a default constructor
public class DefaultConstructorprovidedbycompiler {

	// Instance variables (also called fields or properties)
	// These variables will hold individual student data
	String name; // Default value will be null
	int rollNumber; // Default value will be 0

	// No constructor is defined explicitly by us here.
	// So Java automatically provides a default constructor like this behind the
	// scenes:
	// DefaultConstructorprovidedbycompiler() {
	// super(); // Call to Object class constructor
	// }

	// A method to display the values of the object
	void display() {
		System.out.println("Name: " + name); // Will print: Name: null (default for String)
		System.out.println("Roll Number: " + rollNumber); // Will print: Roll Number: 0 (default for int)
	}

	// main() method is the entry point of this program
	public static void main(String[] args) {

		// Creating an object of the class using the default constructor
		// Since we didn’t define any constructor, Java uses its own default constructor
		DefaultConstructorprovidedbycompiler s1 = new DefaultConstructorprovidedbycompiler();

		// Call the display method on the object
		// This will print default values: name = null, rollNumber = 0
		s1.display();
	}
}
