package coreJava.stingHandling;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// Create a scanner object to take input from the user
		Scanner scanner = new Scanner(System.in);

		// asks user for input
		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();

		// Variables to keep track of vowel count
		int vowelCount = 0;

		// Loop through each character in the sentence
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			// Check if the character is is vowel
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				vowelCount++;
			}

		}

		// Display the results
		System.out.println("Vowel letters count is: " + vowelCount);

	}

}
