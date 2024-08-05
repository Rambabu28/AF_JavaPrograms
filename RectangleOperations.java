package coreJava.oops;

import java.util.Scanner;

public class RectangleOperations {

	public static void main(String[] args) {

		// creating rectangle object
		Rectangle rectangle1 = new Rectangle();
		// calling method to send input from key board
		rectangle1.inputSides();
		rectangle1.perimeterOfRectangle();
		rectangle1.areaOfRectangle();

	}

}

class Rectangle {
	private float length;
	private float breadth;

	public void inputSides() {
		/*----------creating scanner class object----------------------*/
		Scanner sc = new Scanner(System.in);
		/*----------------------------------------------------------------------------------------------*/
		/*----------- taking user input from key board----------------*/
		System.out.print("Enter length of rectangle:");
		length = sc.nextFloat();
		System.out.print("Enter breadth of rectangle:");
		breadth = sc.nextFloat();
		/*----------------------------------------------------------------------------------------------*/

	}

	// method to display sides
	public void dispalySides() {
		System.out.println("length of rectangle is:" + length);
		System.out.println("breadth of rectangle is:" + breadth);

	}

	/*----------------------------------------------------------------------------------------------*/
	/*-----------caliculates perimeter of rectangle---------------*/
	public void perimeterOfRectangle()

	{
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		dispalySides();
		System.out.println("Perimeter of rectangle is : " + 2 * (length + breadth));
	}

	/*----------------------------------------------------------------------------------------------*/
	/*--------caliculates area of rectangle-----------*/
	public void areaOfRectangle()

	{
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		dispalySides();
		System.out.println("Perimeter of rectangle is : " + (length * breadth));

	}

}
