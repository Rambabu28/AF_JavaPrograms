package coreJava.stingHandling;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// Create a scanner object to take input through key board
				Scanner scanner = new Scanner(System.in);
				// asks user for input sentance
				System.out.print("Enter a sentence:");
				String sentence = scanner.nextLine();
				StringOperations s=new StringOperations();
   System.out.println("total no.of consonents: "+s.consonentCounter(sentence));
   System.out.println("total no.of vowel: "+s.vowelCounter(sentence)); 
   System.out.println("total no.of digits: "+s.digitCounter(sentence));  
   System.out.println("total no.of specialcharaters: "+s.specialCharCounter(sentence));
   System.out.println("total no.of upparcase: "+s.countUpperCaseAlpha(sentence)); 
   System.out.println("total no.of lowercase: "+s.countLowerCaseAlpha(sentence));  



	}
	
/*...................................................................................................*/
	// this method is used for counting the special characters in given sentance
	public int specialCharCounter(String sentence) {
		
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
		// this statement return the count of special characters
		return specialCharCount;
	}

	/*.............................................................................*/
	// this method is used for counting the special characters
	public int vowelCounter(String sentence) {

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
		// this statement return the count of vowels
		return vowelCount;

	}

	/*.............................................................................*/
	// this method is used for counting the consonents in a given sentence
	public int consonentCounter(String sentence) {

		// Variables to keep track of consonent count
		int consonentCount = 0;

		// Loop through each character in the sentence
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			// this logic help to find the consonents from the given sentence
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

				if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e'
						|| ch == 'i' || ch == 'o' || ch == 'u')) {
					consonentCount++;
				}

			}

		}
		// this statement return the count of consonents
		return consonentCount;
	}

	/*.............................................................................*/
	// this method is used for counting the digits in a given sentence
	public int digitCounter(String sentence) {

		// Variables to keep track of digit count
		int digitCount = 0;

		// Loop through each character in the sentence
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			// this logic help to find the consonents from the given sentence
			if (ch >= '0' && ch <= '9') {

				digitCount++;

			}

		}
		// this statement return the count of digits
		return digitCount;
	}
	/*.....................................................................................*/
	//this method is used to count upper case letters
	public int countUpperCaseAlpha(String sentence)
	{
		int upperCount=0;
		
		// Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check if the character is uppercase
            if (ch>='A'&&ch<='Z') {
                upperCount++;
            }
		
	}
        //returns upper count
		return upperCount; 

}
	/*..............................................................................*/
	//this method is used to count lower case letters
		public int countLowerCaseAlpha(String sentence)
		{
			int lowerCount=0;
			
			// Loop through each character in the sentence
	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);

	            // Check if the character is uppercase
	            if (ch>='a'&&ch<='a') {
	                lowerCount++;
	            }
			
		}
	        //returns  the lowercount
			return lowerCount; 

	}
	
}
