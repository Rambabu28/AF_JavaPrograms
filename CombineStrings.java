package coreJava.stingHandling;

import java.util.Scanner;

public class CombineStrings {

	public static void main(String[] args) {
		// Create a scanner object to take input from the user
		Scanner scanner = new Scanner(System.in);

		//asks user for input
		System.out.print("Enter string1: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter string2: ");
		String str2 = scanner.nextLine();
		// concatinating and printing strings using + operator
		System.out.println("the concatinated String is: "+str1 + str2);
		
		// concatinating and printing strings using concat method
		String result=str1.concat(str2);
		System.out.println("the concatinated String is: "+result);

	}

}
