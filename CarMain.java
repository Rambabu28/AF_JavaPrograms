package coreJava.lab5;

public class CarMain {

	public static void main(String[] args) {
		// mahindra object created
		Mahindra m = new Mahindra();
		// it will display the brand

		m.dispalyFeatures();

		// car will starts if we call the method
		m.startEngine();
		// car will stops if we call the method
		m.stopEngine();
	}

}

// this is parent class
class Car {
	String carName = "Thar";
	String carType = "automatic";
	String carColur = "Black";
	float carMilage = 20;
	float engineCapacity = 1500;

	public Car() {
		super();
	}

//this is the base class constructure
	public Car(String carName, String carType, String carColur, float carMilage, float engineCapacity) {
		super();
		this.carName = carName;
		this.carType = carType;
		this.carColur = carColur;
		this.carMilage = carMilage;
		this.engineCapacity = engineCapacity;
	}

	// methods in parent class
	public void startEngine() {
		System.out.println("Engine is started");
	}

	public void stopEngine() {
		System.out.println("Engine is stoped");
	}

}

// this is child class
class Mahindra extends Car {
	String brand = "Mahindra";

	public Mahindra() {
		super();
	}

	public Mahindra(String carName, String carType, String carColur, float carMilage, float engineCapacity,
			String brand) {
		super(carName, carType, carColur, carMilage, engineCapacity);
		this.brand = brand;
	}

	public void dispalyFeatures() {
		System.out.println("the name of the car is:" + super.carName);
		System.out.println("the colur of the car is:" + super.carColur);
		System.out.println("the type of the car is:" + super.carType);
		System.out.println("the milage of the car is:" + super.carMilage + "km");
		System.out.println("the brand of the car is:" + this.brand);
		System.out.println("the engine capacity of the car is:" + super.engineCapacity + "cc");

	}

	// this method is derived from parent class
	public void startEngine() {
		System.out.println("Mahindra car Engine is started with more features");
	}

}