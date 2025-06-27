package Encapsulation;

//Student.java

//This class represents a Student with a name and marks.
//It uses Encapsulation to protect and manage its internal data.
public class Student {

	// Private fields: can’t be accessed directly from outside the class
	private String name;
	private int marks;

	// Constructor: runs when we create a Student object
	// It accepts a name and assigns it to the 'name' field
	public Student(String name) {
		// 'this.name' refers to the field
		// 'name' refers to the parameter
		this.name = name;
	}

	// Getter: allows safe access to the 'marks' field
	public int getMarks() {
		return marks;
	}

	// Setter: allows safe modification of the 'marks' field
	// Adds validation to make sure only valid marks are set (0 to 100)
	public void setMarks(int marks) {
		if (marks >= 0 && marks <= 100) {
			// If marks are valid, assign them to the field
			this.marks = marks;
		}
		// If invalid, nothing happens — value is not updated
	}

	// (Optional) Getter for name if needed
	public String getName() {
		return name;
	}
}
