package Inheritance;

// Base class (also called Superclass or Parent class)
class Person {
	String name;
	int age;

	// Constructor of Person class
	// It initializes the name and age of the person
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display person details
	// This method can be inherited by subclasses
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

// Subclass (also called Child class or Derived class)
// This class extends Person, meaning it inherits all variables and methods of Person
class Employee extends Person {
	String company;

	// Constructor of Employee class
	// It uses super() to call the constructor of the parent class Person
	// and also sets the company field for Employee
	Employee(String name, int age, String company) {
		super(name, age); // super() is used to call the constructor of the parent class
		this.company = company;
	}

	// Method specific to Employee class
	// This is not present in the Person class
	void showCompany() {
		System.out.println("Company: " + company);
	}
}

// Main class to run the program
public class MainInheritance {
	public static void main(String[] args) {

		// Creating an object of the subclass Employee
		// We are passing name, age, and company values to the constructor
		Employee emp = new Employee("Sunil", 25, "TCS");

		// This method comes from the parent class Person
		// Even though we didn't write displayDetails() in Employee, it is inherited
		emp.displayDetails();

		// This method is from the Employee class
		// Only available in Employee, not in Person
		emp.showCompany();
	}
}
