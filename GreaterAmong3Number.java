package coreJava.lab3;

import java.util.Scanner;

public class GreaterAmong3Number {

	public static void main(String[] args) {
		
		//program to find greatest number among three 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 =sc.nextInt();
		System.out.println("Enter the first number");

		int num2 = sc.nextInt();
		System.out.println("Enter the Second number");

		int num3 = sc.nextInt();
		if (num1 > num2) {

			if (num1 > num3) {
				System.out.println(num1 + ":is greater");
			} else {
				System.out.println(num3 + ":is greater");
			}
		} else {
			if (num2 > num3) {
				System.out.println(num2 + ":is greater");
			} else {
				System.out.println(num3 + ":is greater");

			}
		}
	}

}
