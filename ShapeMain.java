package coreJava.lab6;

//Base class Shape
class Shape {
	String color;
	boolean filled;

	// Parameterized constructor to initialize color and filled
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Method to display shape details
	public void displayInfo() {
		System.out.println("Color: " + color);
		System.out.println("Filled: " + (filled ? "Yes" : "No"));
	}
}

//Subclass Circle that inherits from Shape
class Circle extends Shape {
	double radius;

	// Parameterized constructor to initialize color, filled, and radius
	public Circle(String color, boolean filled, double radius) {
		super(color, filled); // Call the constructor of the superclass Shape
		this.radius = radius;
	}

	// Method to calculate the area of the circle
	public double getArea() {
		return 3.14 * (radius * radius);
	}

	// Override method to display circle details

	public void displayInfo() {
		super.displayInfo(); // Call the superclass method to display color and filled
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + getArea());
	}
}

//Subclass Rectangle that inherits from Shape
class Rectangle extends Shape {
	double width;
	double height;

	// Parameterized constructor to initialize color, filled, width, and height
	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled); // Call the constructor of the superclass Shape
		this.width = width;
		this.height = height;
	}

	// Method to calculate the area of the rectangle
	public double getArea() {
		return width * height;
	}

	// Override method to display rectangle details
	@Override
	public void displayInfo() {
		super.displayInfo(); // Call the superclass method to display color and filled
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Area: " + getArea());
	}
}

public class ShapeMain {
	public static void main(String[] args) {
		// Create an instance of Circle
		Circle myCircle = new Circle("Red", true, 5.0);
		System.out.println("Circle Details:");
		myCircle.displayInfo();

		// Create an instance of Rectangle
		Rectangle myRectangle = new Rectangle("Blue", false, 4.0, 7.0);
		System.out.println("\nRectangle Details:");
		myRectangle.displayInfo();
	}
}
