package Abstraction;

/*
 * Abstraction Practice Question
Q:
Create an abstract class Vehicle with:

An abstract method start()

A concrete method fuel() that prints "Vehicle needs fuel to run."

Then:

Create a Car class that extends Vehicle and implements start() to print "Car starts with a key."

In MainVehicle, create a Vehicle reference to a Car object, and call start() and fuel().
 */
// Abstract class representing a generic Vehicle
abstract class Vehicle {

	// Abstract method - hides internal start mechanism from the user
	// Forces subclasses (like Car, Bike, etc.) to provide their own implementation
	abstract void start();

	// Concrete method - common logic shared by all vehicles
	// This is not abstract because "fuel is needed" is a general fact and
	// understandable by users
	void fuel() {
		System.out.println("Vehicle needs fuel to run.");
	}
}

// Car class is a specific type of Vehicle
// It EXTENDS Vehicle to inherit behavior and must implement abstract methods
class Car extends Vehicle {

	// We use @Override to show we are providing custom implementation of abstract
	// start() method
	@Override
	void start() {
		System.out.println("Car starts with a key."); // specific way a Car starts
	}
}

// Main class to run the program
public class MainVehicleAchieveByUsingAbstract {
	public static void main(String[] args) {

		// Abstraction in action:
		// We create a Vehicle reference but use a Car object
		// This means the user knows they are using a Vehicle, but doesn't care about
		// the actual implementation
		Vehicle myCar = new Car();

		// The user just knows how to start the vehicle — no need to know internal
		// mechanics
		myCar.start(); // This will call Car's implementation of start()

		// Fuel is a common method, and every Vehicle can use it without needing to
		// override it
		myCar.fuel(); // This calls the concrete method defined in Vehicle
	}
}
