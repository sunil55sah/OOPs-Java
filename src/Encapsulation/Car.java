package Encapsulation;

//Car.java

//This class represents a Car with a model and engine state.
public class Car {

	// Private fields to protect internal data (Encapsulation)
	private String model;
	private boolean engineOn;

	// Constructor: initializes the car with a model and engine off by default
	public Car(String model) {
		this.model = model; // Set the car model
		this.engineOn = false; // Engine is off initially
	}

	// Method to start the engine
	public void startEngine() {
		engineOn = true; // Change engine state to ON
	}

	// Method to stop the engine
	public void stopEngine() {
		engineOn = false; // Change engine state to OFF
	}

	// Getter method to check if engine is ON or OFF
	public boolean isEngineOn() {
		return engineOn; // Return current engine state
	}
}
