package coreJava.collectionPracatice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class GreatestNumber {

	public static void main(String[] args) {
		// creating scanner calss
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.println("enter any 15 numbers.");
		for(int i=0;i<=14;i++)
		{
			numbers.add(sc.nextInt());
		}
		//intialising vector with numbers in array list
		Vector<Integer> num=new Vector<Integer>(numbers);
		
		 // Find the greatest number in the vector
        int greatestNumber = num.get(0); // Assuming the first number is the greatest
        
        for (int i = 1; i < num.size(); i++) {
            if (num.get(i) > greatestNumber) {
                greatestNumber = num.get(i); // Update if a greater number is found
            }
        }
        
        // Output the greatest number
        System.out.println("The greatest number is: " + greatestNumber);
        
		
	}

}
