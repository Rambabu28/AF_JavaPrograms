package coreJava.stingHandling;

import java.util.Scanner;

public class EqualityOfStrings {

	public static void main(String[] args) {
		// Create a scanner object to take input from the user
		Scanner scanner = new Scanner(System.in);

		// asks user for input
		System.out.print("Enter string1: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter string2: ");
		String str2 = scanner.nextLine();
		
		// cheks the equality of the srings
		if (str1.equals(str2)) {
			System.out.println("two strings are equal");
		} else {
			System.out.println(" two strings are not equal");

		}
	}

}
