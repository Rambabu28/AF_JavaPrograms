package coreJava.lab3;

public class Pattren {
	// program to print number pattren in range of 1 to 5
	public static void main(String[] args) {
		// this loop indicates i th position in a matrix or also row
		for (int i = 1; i <= 5; i++) {
			int a = 1;
			// this loop indicates j th position in a matrix also we can say colum
			for (int j = 1; j <= 5; j++) {
				// cheacking the condition to print pattren
				if (i >= j) {
					System.out.print(a++);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
