package ClassandObject;

// Class definition for Student
public class Student {

	// Properties (state) of each student object
	String name;
	int rollNumber;
	double marks;

	// Method to display student details
	void displayDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Marks: " + marks);
	}
}
