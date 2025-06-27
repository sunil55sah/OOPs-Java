package Inheritance;

//Interface 1
interface Writer {
	void write();
}

//Interface 2
interface Reader {
	void read();
}

//Class implementing both interfaces
class Editor implements Writer, Reader {
	@Override
	public void write() {
		System.out.println("Editor writes content.");
	}

	@Override
	public void read() {
		System.out.println("Editor reads content.");
	}
}

public class MultipleInheritanceInterfaceExample {
	public static void main(String[] args) {
		Editor e = new Editor();
		e.write();
		e.read();
	}
}
