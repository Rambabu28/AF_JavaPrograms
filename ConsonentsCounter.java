package coreJava.stingHandling;

import java.util.Scanner;

public class ConsonentsCounter {

	public static void main(String[] args) {
		// Create a scanner object to take input through key board
		Scanner scanner = new Scanner(System.in);

		// asks user for input sentance
		System.out.print("Enter a sentence:");
		String sentence = scanner.nextLine();
		
		// Variables to keep track of consonent count
		int consonentCount = 0;
		
		// Loop through each character in the sentence
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
		
			 //this logic help to find the consonents from the given sentence
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

				if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e'
						|| ch == 'i' || ch == 'o' || ch == 'u')) {
					consonentCount++;
				}

			}

		}
		// this statement print the count of consonents
		System.out.println("Total no.of consonents is:" + consonentCount);

	}

}
