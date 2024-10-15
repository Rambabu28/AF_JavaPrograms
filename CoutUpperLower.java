package coreJava.stingHandling;

import java.util.Scanner;

public class CoutUpperLower {

	    public static void main(String[] args) {
	        // Create a scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        //asks  user for input
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        // Variables to keep track of uppercase and lowercase counts
	        int upperCount = 0;
	        int lowerCount = 0;

	        // Loop through each character in the sentence
	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);

	            // Check if the character is uppercase
	            if (ch>='A'&&ch<='Z') {
	                upperCount++;
	            }
	            // Check if the character is lowercase
	            else if (ch>='a'&&ch<='z') {
	                lowerCount++;
	            }
	        }

	        // Display the results
	        System.out.println("Uppercase letters: " + upperCount);
	        System.out.println("Lowercase letters: " + lowerCount);
	    }
	}



