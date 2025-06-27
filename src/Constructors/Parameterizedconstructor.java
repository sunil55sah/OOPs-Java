package Constructors;

// 🔸 Class demonstrating Parameterized Constructor
public class Parameterizedconstructor {

	// 🔹 Properties (instance variables)
	String name;
	int rollNumber;

	// 🔹 Parameterized Constructor (user-defined)
	public Parameterizedconstructor(String studentName, int studentRoll) {
		// Initialize object variables using constructor parameters
		this.name = studentName; // 'this.name' refers to the instance variable
		this.rollNumber = studentRoll; // 'this.rollNumber' refers to the instance variable
	}// studentRoll is parameter of a method (or constructor) behaves very much like
		// a local variable.

	// 🔹 Method to display student details
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}

	// 🔹 Main method to run the program
	public static void main(String[] args) {
		// Creating objects using the parameterized constructor
		Parameterizedconstructor s1 = new Parameterizedconstructor("Sunil", 101);
		Parameterizedconstructor s2 = new Parameterizedconstructor("Ravi", 102);

		// Display details of both students
		s1.display();
		System.out.println("-------------");
		s2.display();
	}
}
