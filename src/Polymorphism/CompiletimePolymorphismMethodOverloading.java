package Polymorphism;

/*
 * Method overloading means same method name but different parameters 
 * (number or type) in the same class.
 */
class Calculator {

	// Method to add two integers
	int add(int a, int b) {
		return a + b;
	}

	// Overloaded method: adds three integers
	int add(int a, int b, int c) {
		return a + b + c;
	}

	// Overloaded method: adds two doubles
	double add(double a, double b) {
		return a + b;
	}
}

public class CompiletimePolymorphismMethodOverloading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// Based on arguments, compiler decides which 'add' method to call
		System.out.println(calc.add(2, 3)); // Calls int add(int, int)
		System.out.println(calc.add(2, 3, 4)); // Calls int add(int, int, int)
		System.out.println(calc.add(2.5, 3.5)); // Calls double add(double, double)
	}
}
