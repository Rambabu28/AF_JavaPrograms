package ArraysPrograms;

import java.util.Scanner;

public class HeighestElement {

	public static void main(String[] args) {
		/*----------creating scanner class object-----------------------------------------*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of students:");
		int len = sc.nextInt();
		/*----------crating an array object----------------------------------------------------*/
		int[] marks = new int[len];
		/*----------decalring variables to caliculate----------------------------------------------------*/

		/*----------------------------------------------------------------------------------------*/
		// to initialise elements in run time
		System.out.print("enter " + len + " marks:");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		/*----------------------------------------------------------------------------------------*/
		System.out.println("----------------------------------------------------------------------------------");
		// printing arrray elements
		System.out.println("displaying marks of students:");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i] + ",");

		}
		// finding heighest marks 
		int heighest = marks[0];
		for (int i = 0; i < marks.length; i++) {

			if (heighest < marks[i]) {
				heighest = marks[i];
			}

		}
		System.out.println("Heighest marks is:" + heighest);
	}

}
