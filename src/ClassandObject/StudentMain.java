package ClassandObject;

public class StudentMain {
	public static void main(String[] args) {

		// Creating the first student object
		Student student1 = new Student();

		// Assign values to the student1 object
		student1.name = "Sunil";
		student1.rollNumber = 101;
		student1.marks = 85.5;

		// Display student1's details
		student1.displayDetails();

		System.out.println("-------------------");

		// Creating another student object
		Student student2 = new Student();

		// Assign values to student2 object
		student2.name = "Ravi";
		student2.rollNumber = 102;
		student2.marks = 92.0;

		// Display student2's details
		student2.displayDetails();
	}
}
