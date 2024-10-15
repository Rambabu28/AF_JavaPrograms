package coreJava.ExceptionHandlingPractice;

import java.util.Scanner;

//program to divide 2 numbers
public class Divide {
	public static void main(String[] args) {
//created scanner class to take user input from key board
		Scanner sc = new Scanner(System.in);
		//ask user to enter first number
		System.out.print("Enter the firsrt number:");
		int number1 = sc.nextInt();
		//ask user to enter second number
		System.out.print("Enter the second number:");
		int number2 = sc.nextInt();

		// it will print the quotient afrer performing division
		System.out.print("Quotient of num1 and num2 aftre division is:" + (number1 / number2));

	}

}
