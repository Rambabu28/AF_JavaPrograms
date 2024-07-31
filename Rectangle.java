package coreJava.methods;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// creating scanner class objest
		Scanner sc = new Scanner(System.in);
		// taking user input from key board
		System.out.print("enter breadth of rectangel:");
		float breadth = sc.nextFloat();
		System.out.print("enter length of rectangel:");
		float length = sc.nextFloat();
		System.out.println("perimeter of rectangel is:" + perimeterOfRectangle(length, breadth));
		System.out.println("area of a rectangle is:" + areaOfRectangle(length, breadth));
	}

	// caliculates perimeter of rectangle
	public static float perimeterOfRectangle(float len, float breadth)

	{
		return (2 * len * breadth);
	}
	// caliculates area of rectangle
	public static float areaOfRectangle(float len, float breadth)

	{
		return (len * breadth);
	}

}
