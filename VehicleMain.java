package coreJava.lab6;

 // Base class Vehicle
class Vehicle {
    String make;
    String model;

    // Parameterized constructor to initialize make and model
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

// Subclass Car that inherits from Vehicle
 class Car extends Vehicle {
    int year;

    // Parameterized constructor to initialize make, model, and year
    public Car(String make, String model, int year) {
        super(make, model); // Call the constructor of the superclass Vehicle
        this.year = year;
    }

    // Override method to display car details, including year
   
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method to display make and model
        System.out.println("Year: " + year);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car("Toyota", "Corolla", 2021);

        // Display information about the car
        myCar.displayInfo();
    }
}

