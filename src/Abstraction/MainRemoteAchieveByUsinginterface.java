package Abstraction;

// Interface representing a contract for any Remote Control
// ✅ This is called a "contract" because it defines WHAT actions must be implemented (but not HOW)
// ✅ All methods in an interface are by default abstract and public
// ✅ Hiding happens because only method names are visible — no logic is shown
interface RemoteControl {

	// These are abstract methods — no body, just signatures
	// They tell what a remote control can do (turnOn, turnOff)
	// Implementation (how they work) is hidden from the user
	void turnOn();

	void turnOff(); // Multiple methods are allowed in an interface
}

// TV class implements the RemoteControl interface
// ✅ 'implements' means this class is promising to write logic for all interface methods
// ✅ This is where the hidden internal logic lives
class TV implements RemoteControl {

	// ✅ @Override tells the compiler that we are giving the specific implementation
	// If you misspelled a method name or forget it, @Override will show a
	// compile-time error
	@Override
	public void turnOn() {
		// Internal logic of turning on the TV (HIDDEN from the user)
		System.out.println("TV is turned ON.");
	}

	@Override
	public void turnOff() {
		// Internal logic of turning off the TV (HIDDEN from the user)
		System.out.println("TV is turned OFF.");
	}
}

// Main class to run the program
public class MainRemoteAchieveByUsinginterface {
	public static void main(String[] args) {

		// ✅ Abstraction in action
		// We create a RemoteControl reference but point it to a TV object
		// So, the user interacts with RemoteControl — not the actual TV class
		RemoteControl myRemote = new TV();

		// ✅ Exposed to user — simple commands
		myRemote.turnOn(); // Calls the hidden implementation inside TV
		myRemote.turnOff(); // Calls the hidden implementation inside TV
	}
}
