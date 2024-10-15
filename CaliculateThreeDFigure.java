package coreJava.oops.abstraction;

import java.util.Scanner;

public class CaliculateThreeDFigure {

	public static void main(String[] args) {
		// creted scanner class take user input from the key board
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of the cylinder:");
		float height = sc.nextFloat();
		System.out.print("Enter radius of the cylinder:");
		float radius = sc.nextFloat();

		Cylinder c1 = new Cylinder(height, radius);
		// this method call will give cureved surface area of cylider
		c1.calculateCurvedsurfaceArea();
		// this method call will give toatl surface area of cylinder
		c1.totalSurfaceArea();
		// this method will give the volumr of cylinder
		c1.volume();
	}

}

interface ThreeDFigure {
	// here I inialized pi varaible beacuse it is constant
	float pi = 3.14f;

	// this is an abstract method to caliculate CurvedsurfaceArea
	void calculateCurvedsurfaceArea();

//this is an abstract method to caliculate totalsurfaceArea
	void totalSurfaceArea();

//this is an abstract method to caliculate volume
	void volume();
}

class Cylinder implements ThreeDFigure {

	float height;
	float radius;

	public Cylinder(float height, float radius) {
		super();
		this.height = height;
		this.radius = radius;
	}

	// this method is to caliculate CurvedsurfaceArea

	public void calculateCurvedsurfaceArea() {
		System.out.println("------------------------------------------------------------");
		System.out.println(
				"The curved surcace area of the cylinder is:" + (2 * ThreeDFigure.pi * radius * height) + " Square cms");
		System.out.println("------------------------------------------------------------");

	}

	//this  method is to caliculate totalsurfaceArea

	public void totalSurfaceArea() {
		System.out.println("------------------------------------------------------------");

		System.out.println("The total surcace area of the cylinder is:"
				+ (2 * ThreeDFigure.pi * radius * (radius + height)) + " Square cms");
		System.out.println("------------------------------------------------------------");

	}

	//this  method is to caliculate volume
	public void volume() {
		System.out.println("------------------------------------------------------------");

		System.out.println(
				"The volume of the cylinder is:" + (ThreeDFigure.pi * (radius * radius) * height) + " Cuble cms");
		System.out.println("------------------------------------------------------------");

	}

}
