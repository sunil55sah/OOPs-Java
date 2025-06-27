package Encapsulation;

/*
 *  Car
Create a Car class with private fields: model (String) and engineOn (boolean).

Add constructor to initialize the car model and default engine to off.

Add methods: startEngine(), stopEngine(), isEngineOn().

In Main, take model name from user, start and stop the engine, and show engine status.
 */
import java.util.Scanner;

public class MainForCar {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter the car model
		System.out.print("Enter car model: ");
		String model = sc.nextLine(); // Read the full line input as car model

		// Create a new Car object using the entered model
		Car myCar = new Car(model);

		// Start the car engine by calling startEngine method
		System.out.println("Starting engine...");
		myCar.startEngine();

		// Check and display whether the engine is on
		System.out.println("Is engine on? " + myCar.isEngineOn());

		// Stop the car engine by calling stopEngine method
		System.out.println("Stopping engine...");
		myCar.stopEngine();

		// Check and display whether the engine is off now
		System.out.println("Is engine on? " + myCar.isEngineOn());

		// Close the Scanner object to free resources
		sc.close();
	}
}
