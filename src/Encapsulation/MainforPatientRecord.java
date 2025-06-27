package Encapsulation;

/*
 PatientRecord
Create a PatientRecord class with private fields: patientName, age, and diagnosis.

Add a constructor to initialize name and age.

Write getter for patient name and getter/setter for diagnosis.

In Main, take patient name and age as input using Scanner, then set diagnosis and display details.
 */
public class MainforPatientRecord {

	public static void main(String[] args) {

		// ✅ Creating an object of PatientRecord
		// This calls the constructor and assigns values to patientName and age
		PatientRecord patient1 = new PatientRecord("Sunil", 25);

		// ✅ Accessing private data using getter
		// You cannot do: patient1.patientName (because it's private)
		// So we use the getter method instead
		System.out.println("Patient Name: " + patient1.getPatientName());

		// ✅ Updating private data using setter
		// You cannot do: patient1.diagnosis = "Flu" (because it's private)
		// So we use the setter method instead
		patient1.setDiagnosis("Flu");

		// ✅ Getting the updated diagnosis using getter
		System.out.println("Diagnosis: " + patient1.getDiagnosis());
	}
}
