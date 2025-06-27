package Encapsulation;

/* 
 * Student
Create a Student class with private fields: name and marks.

Add constructor to initialize name.

Write a setter for marks that only accepts values between 0–100.

Write a getter for marks.

In Main, use Scanner to take student name and marks as input and display valid data.
 */
// Import Scanner class
import java.util.Scanner;

public class MainForStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create Scanner object

		// Ask for the student's name
		System.out.print("Enter student name: ");
		String name = scanner.nextLine(); // Read full line for name

		// Create Student object using the name entered by user
		Student s1 = new Student(name);

		// Ask for marks
		System.out.print("Enter marks (0–100): ");
		int marks = scanner.nextInt(); // Read integer marks

		// Set the marks using setter (includes validation)
		s1.setMarks(marks);

		// Display result
		System.out.println("\n--- Student Details ---");
		System.out.println("Name: " + s1.getName());
		System.out.println("Marks: " + s1.getMarks()); // Only shows valid marks

		scanner.close(); // Close the Scanner (good practice)
	}
}
