package coreJava.stingHandling;

import java.util.Scanner;

public class SpecialCharCount {
	public static void main(String[] args) {
		// Create a scanner object to take input through key board
		Scanner scanner = new Scanner(System.in);

		// asks user for input sentance
		System.out.print("Enter a sentence:");
		String sentence = scanner.nextLine();

		// Variables to keep track of special charecters
		int specialCharCount = 0;

		// Loop through each character in the sentence
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			/*
			 * Check if the character is special character character other than the
			 * alphanumeric character is known as special character
			 */
			if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {
				specialCharCount++;
			}

		}

		// Display the results
		System.out.println("Total number of special characters: " + specialCharCount);

	}

}
