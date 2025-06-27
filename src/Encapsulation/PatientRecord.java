package Encapsulation;

public class PatientRecord {

	// ✅ private to protect the data (Encapsulation)
	private String patientName;
	private int age;
	private String diagnosis;

	// ✅ A constructor is a special method that runs when we create an object.
	public PatientRecord(String name, int age) {
		// ✅ if we don't use 'this' keyword then we just assign the parameter to itself.
		// ✅ this.patientName refers to the field (instance variable)
		// ✅ patientName (without this) refers to the constructor parameter
		this.patientName = name;
		this.age = age;
	}

	// ✅ A getter is a method used to access private data safely.
	public String getPatientName() {
		return patientName;
	}

	// ✅ A setter is a method used to update private data safely.
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	// ✅ A getter is a method used to access private data safely.
	public String getDiagnosis() {
		return diagnosis;
	}
}
