package Constructors;

public class NoArgConstructor {

	// 🔹 Instance variables
	String name;
	int rollNumber;

	// 🔸 No-argument constructor (explicitly defined by the programmer)
	public NoArgConstructor() {
		// Setting default values inside the constructor
		name = "Sunil";
		rollNumber = 999;
	}

	// 🔹 Method to display the values
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}

	// 🔹 Main method
	public static void main(String[] args) {
		// 🔸 Creating object using no-arg constructor
		NoArgConstructor s1 = new NoArgConstructor();
		s1.display();
	}
}
