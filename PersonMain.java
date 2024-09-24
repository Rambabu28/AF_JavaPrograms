package coreJava.lab6;

//Base class Person
class Person {
 String name;
 int age;

 // Parameterized constructor to initialize name and age
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display person details
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Subclass Employee that inherits from Person
class Employee extends Person {
 String employeeId;

 // Parameterized constructor to initialize name, age, and employeeId
 public Employee(String name, int age, String employeeId) {
     super(name, age); // Call the constructor of the superclass Person
     this.employeeId = employeeId;
 }

 // Override method to display employee details
 @Override
 public void displayInfo() {
     super.displayInfo(); // Call the superclass method to display name and age
     System.out.println("Employee ID: " + employeeId);
 }
}

public class PersonMain {
 public static void main(String[] args) {
     // Create an instance of Employee
     Employee employee = new Employee("John Doe", 30, "E12345");

     // Display information about the employee
     employee.displayInfo();
 }
}

