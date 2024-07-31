package ArraysPrograms;

import java.util.Scanner;

public class AverageOfArrayElemnts {

	public static void main(String[] args) {

		/*----------creating scanner class object-----------------------------------------*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the arry:");
		int len = sc.nextInt();
		/*----------crating an array object----------------------------------------------------*/
		int[] numbers = new int[len];
		/*----------decalring variables to caliculate----------------------------------------------------*/

		float avg = 0;
		int sum = 0;
		/*----------------------------------------------------------------------------------------*/
		// to initialise elements in run time
		System.out.print("enter " + len + " elements:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		/*----------------------------------------------------------------------------------------*/
		System.out.println("----------------------------------------------------------------------------------");
		// printing arrray elements
		System.out.println("displaying elements of an array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + ",");
			sum += numbers[i];
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Avarage of Array elements is:" + sum / numbers.length);
	}

}
