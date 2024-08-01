package coreJava.oops;

import java.util.Scanner;

public class CircleOperation {

	public static void main(String[] args) {
//created circle object
		Circle circle1 = new Circle();
		// taking input from user from key board
		circle1.inputRadius();
System.out.println("---------------------------------------------------");
		// to dispaly radius
		circle1.dispalyRadius();

		// to caliculate perimetr
		circle1.perimeterOfCircle();

		// to caliculate area
		circle1.areaOfCircle();

	}

}

class Circle {
	// declaring variable
	private float radius;
	// initialising value becase it is fixed value.
	final private float pi = 3.14159f;

	public void inputRadius() {

		// taking radius as input from key board
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius:");
		radius = sc.nextFloat();
	}

// to dispaly radius
	public void dispalyRadius() {
		System.out.println("RadiusOfCircle is : " + radius);
	}

//caliculates perimater
	public void perimeterOfCircle() {

		System.out.println("PerimeterOfCircle is : " + (2 * pi )* radius);
	}

//caliculates area
	public void areaOfCircle() {

		System.out.println("AreaOfCircle is : " + pi * (radius * radius));

	}

}
