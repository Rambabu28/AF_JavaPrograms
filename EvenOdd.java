package coreJava.methods;

import java.util.Scanner;

public class EvenOdd {
/*-------program to check the given number is even or odd----------------*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number to check even or odd:");
		/*------------- Reading data from user from key board -------------------*/
		evenOrOdd(sc.nextInt());

	}

	/* --------------this method is used to find even and odd -------------*/
	public static void evenOrOdd(int num) {
	/*--------------- checking the condition for even or odd------------- */
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}

}
