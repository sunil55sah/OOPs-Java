package Inheritance;

//Superclass
class Shape {
	void displayType() {
		System.out.println("This is a geometric shape.");
	}
}

//Subclass 1
class Circle extends Shape {
	void drawCircle() {
		System.out.println("Drawing a circle.");
	}
}

//Subclass 2
class Square extends Shape {
	void drawSquare() {
		System.out.println("Drawing a square.");
	}
}

public class HierarchicalInheritanceExample {
	public static void main(String[] args) {
		// Object of Circle
		Circle c = new Circle();
		c.displayType(); // inherited method
		c.drawCircle(); // own method

		// Object of Square
		Square s = new Square();
		s.displayType(); // inherited method
		s.drawSquare(); // own method
	}
}
