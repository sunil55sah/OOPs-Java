package Polymorphism;

// Parent class (Superclass)
class Animal {

	// Method to be overridden by subclasses
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

// Child class Dog that overrides the sound() method
class Dog extends Animal {

	@Override // Tells the compiler we're overriding a method from the parent
	void sound() {
		System.out.println("Dog barks");
	}
}

// Child class Cat that also overrides the sound() method
class Cat extends Animal {

	@Override // Tells the compiler we're overriding a method from the parent
	void sound() {
		System.out.println("Cat meows");
	}
}

// Main class to test runtime polymorphism
public class RuntimePolymorphismMethodOverriding {
	public static void main(String[] args) {

		// Declare a reference of the parent type (Animal)
		Animal a;

		// Assigning Dog object to Animal reference
		a = new Dog(); // Parent reference → Dog object
		a.sound(); // Calls Dog's overridden method — output: Dog barks

		// Reassigning Cat object to the same Animal reference
		a = new Cat(); // Parent reference → Cat object
		a.sound(); // Calls Cat's overridden method — output: Cat meows
	}
}

/*
 * Why is this called Runtime Polymorphism?
 * ----------------------------------------------------- - The method to execute
 * (Dog's or Cat's version of sound()) is **decided during runtime**, based on
 * the object type the reference is pointing to. - The compiler only knows that
 * `a` is of type `Animal`, but at runtime, it checks if `a` refers to a `Dog`
 * or `Cat` object, and calls the correct version. This behavior is known as
 * **dynamic method dispatch**.
 */

//Why it's called Runtime Polymorphism?
//Because the method that gets called is decided during runtime, not compile time.