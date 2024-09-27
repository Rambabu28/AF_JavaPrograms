package coreJava.oops;
import java.util.Scanner;

	class CalculateArea {
	    // Method to calculate the area of a circle
	    public double area(double radius) {
	        return 3.14 * radius * radius;
	    }

	    // Method to calculate the area of a square
	    public double area(int side) {
	        return side * side;
	    }

	    // Method to calculate the area of a rectangle
	    public double area(int length, int breadth) {
	        return length * breadth;
	    }
	}

	public class AreaCalculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        CalculateArea calc = new CalculateArea();
	        int choice;

	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Calculate area of Circle");
	            System.out.println("2. Calculate area of Square");
	            System.out.println("3. Calculate area of Rectangle");
	            System.out.println("Enter 4 to Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter radius of circle: ");
	                    double radius = sc.nextDouble();
	                    System.out.println("Area of Circle: " + calc.area(radius));
	                    break;

	                case 2:
	                    System.out.print("Enter side of square: ");
	                    int side = sc.nextInt();
	                    System.out.println("Area of Square: " + calc.area(side));
	                    break;

	                case 3:
	                    System.out.print("Enter length of rectangle: ");
	                    int length = sc.nextInt();
	                    System.out.print("Enter breadth of rectangle: ");
	                    int breadth = sc.nextInt();
	                    System.out.println("Area of Rectangle: " + calc.area(length, breadth));
	                    break;

	                case 4:
	                    System.out.println("Exiting program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	            System.out.println();
	        } while (choice != 4);
	    }
	}

