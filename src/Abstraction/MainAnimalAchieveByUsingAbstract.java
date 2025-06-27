package Abstraction;

//abstract classes and interfaces are the two primary mechanisms for achieving abstraction in Java 
// Abstract class representing a generic Animal
abstract class Animal {

	// Abstract method - behavior that each animal must define in its own way
	abstract void makeSound();

	// Concrete method - common behavior shared by all animals
	void eat() {
		System.out.println("Animal eats food.");
	}
}

// Dog class extends Animal and provides implementation for abstract method
class Dog extends Animal {
	/**
	 * Overrides the abstract makeSound() from Animal. Provides the Dog's specific
	 * sound: barking.
	 */
	@Override // Tells the compiler we're overriding a method from the parent.
	void makeSound() {
		System.out.println("Dog barks.");
	}
}

// Main class to test abstraction
public class MainAnimalAchieveByUsingAbstract {
	public static void main(String[] args) {

		// Abstraction in action:
		// Animal reference points to Dog object
		Animal myDog = new Dog();

		// User only cares about what the animal does, not how it's implemented
		myDog.makeSound(); // Executes Dog's version of makeSound()

		// eat() is shared by all animals - user can call it directly
		myDog.eat(); // Uses the concrete method from Animal
	}
}
