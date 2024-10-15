package coreJava.ExceptionHandlingPractice;

	import java.util.Scanner;
	
	// Custom exception class for invalid input
	class InvalidRadiusException extends Exception {
	    public InvalidRadiusException(String message) {
	        super(message);
	    }
	}

	// Circle class to calculate area and perimeter
	class Circle {
	    private double radius;
        float pi=3.14f;
	    // Constructor to initialize radius
	    public Circle(double radius) throws InvalidRadiusException {
	        if (radius <= 0) {
	            throw new InvalidRadiusException("Radius must be a positive value.");
	        }
	        this.radius = radius;
	    }

	    // Method to calculate the area of the circle
	    public double calculateArea() {
	        return pi * radius * radius;
	    }

	    // Method to calculate the perimeter of the circle
	    public double calculatePerimeter() {
	        return 2 * pi * radius;
	    }
	}

	// Main class for execution
	public class CircleMeasurements {
	    public static void main(String[] args) {

	        try(Scanner sc = new Scanner(System.in);) {
	            // Input from user
	            System.out.print("Enter the radius of the circle: ");
	            double radius = sc.nextDouble();

	            // Creating object of Circle class
	            Circle circle = new Circle(radius);

	            // Calculating and displaying the area and perimeter
	            double area = circle.calculateArea();
	            double perimeter = circle.calculatePerimeter();

	            System.out.println("Area of the Circle: " + area);
	            System.out.println("Perimeter of the Circle: " + perimeter);
	        } catch (InvalidRadiusException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("An error occurred. Please enter a valid numeric value for radius.");
	        } 
	    }
	}



