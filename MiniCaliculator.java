package coreJava.lab3;

import java.util.Scanner;

public class MiniCaliculator {

	public static void main(String[] args) {
		System.out.println("************WELL COME TO MY CALICULATOR***********");
		Scanner sc = new Scanner(System.in);
		int n;
		do {
/*----------------------------------------------------------------------------------------*/		
/*----------Enter values from key board-------------------------------------------*/
			System.out.print("Enter 1st Number:");
			int num1 = sc.nextInt();
			System.out.print("Enter 2nd number:");
			int num2 = sc.nextInt(); 
/*----------------------------------------------------------------------------------------*/				
/*----------------- select any one operation----------------------------------*/
System.out.println("------------select any one operation-------------------------------");
			System.out.println("Enter 1 to perform Addition");
			System.out.println("Enter 2 to perform Subtration");
			System.out.println("Enter 3 to perform Multiplication");
			System.out.println("Enter 4 to perform Division");
			int choice = sc.nextInt();// swithc conditional data
			switch (choice) {
			case 1:
				System.out.println("addition of two numbers is:" +( num1 + num2));
				break;
			case 2:
				System.out.println("subtraction of two numbers is:" + (num1 - num2));
				break;
			case 3:

				System.out.println("multiplication of two numbers is:" + (num1 * num2));
				break;
			case 4:
				System.out.println("Quotient of two numbers is:" + (num1 / num2));
				System.out.println("Remainde of two numbers is:" + (num1 % num2));
				break;
			default:
				System.out.println("invalid");
				break;

			}
			System.out.print("Enter 0 to stop caliculation either press any number to continiue:");
			n=sc.nextInt();		
		}
		while (n != 0);
	}

}
