package Inheritance;

//Parent class (Superclass)
class Animal {
	String type;

	// Constructor to initialize type
	Animal(String type) {
		this.type = type;
	}

	// Method common to all animals
	void eat() {
		System.out.println(type + " eats food.");
	}

	// Method common to all animals
	void sleep() {
		System.out.println(type + " sleeps.");
	}
}

//Child class (Subclass) that inherits from Animal
class Dog extends Animal {

	// Constructor of Dog class
	Dog(String type) {
		// Call parent class constructor using super
		super(type);
	}

	// Method specific to Dog class
	void bark() {
		System.out.println(type + " barks loudly!");
	}
}

//Main class to run the example
public class MainAnimalSingleInheritance {
	public static void main(String[] args) {

		// Creating an object of the subclass Dog
		Dog myDog = new Dog("Dog");

		// Inherited methods from Animal class
		myDog.eat(); // Output: Dog eats food.
		myDog.sleep(); // Output: Dog sleeps.

		// Method from Dog class
		myDog.bark(); // Output: Dog barks loudly!
	}
}
