package coreJava.methods;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		/*----------creating scanner class object----------------------*/
		Scanner sc = new Scanner(System.in);
		/*----------------------------------------------------------------------------------------------*/		
		/*----------- taking user input from key board----------------*/
		System.out.print("enter length of rectangel:");
		float length = sc.nextFloat();
		System.out.print("enter breadth of rectangel:");
		float breadth = sc.nextFloat();
	/*----------------------------------------------------------------------------------------------*/	
		/*------------gives perimeter of rectangle--------------*/
		if(length>0&&breadth>0)
		{
		System.out.println("Perimeter of Rectangel is:" + perimeterOfRectangle(length, breadth));
		}
		else {
			System.err.println("enter positive values");
		}
		/*----------------------------------------------------------------------------------------------*/	
		/*------------ gives area of rectangle--------------------*/
		if(length>0&&breadth>0)
		{
			System.out.println("Area of a Rectangle is:" + areaOfRectangle(length, breadth));
		}
		else {
			System.err.println("enter positive values");
		}
	}
	/*----------------------------------------------------------------------------------------------*/	
	/*-----------caliculates perimeter of rectangle---------------*/
	public static float perimeterOfRectangle(float len, float breadth)

	{
			return (2 * len * breadth);
	}
	/*----------------------------------------------------------------------------------------------*/	
	/*--------caliculates area of rectangle-----------*/
	public static float areaOfRectangle(float len, float breadth)

	{
			return (len * breadth);

		}	

}
