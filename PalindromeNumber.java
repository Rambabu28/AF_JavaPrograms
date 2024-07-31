package coreJava.lab3;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

//creating scanner class object
		Scanner sc = new Scanner(System.in);
//input number from key board
		System.out.println("enter any number to find it is palindrome or not:");
		int num = sc.nextInt();
		int num1 = num;
		int rev = 0;
//logic to reverse the number
		while (num != 0) {
			int last = num % 10;
			rev = last + rev * 10;
			num = num / 10;
		}
		// checkeing  given number and reversed number same or not
		if (num1 == rev) {
			System.out.println("Given number is Palindrome");
		} else {
			System.out.println("Given number is not a Palindrome");

		}
	}

}
