package ArraysPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class TableExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the row length: ");
		int rowLen = sc.nextInt();
		System.out.print("enter the col length:");
		int colLen = sc.nextInt();
		System.out.println("enter " + (rowLen * colLen) + " elements");
		int table[][] = new int[rowLen][colLen];
		for (int row = 0; row < rowLen; row++) {
			for (int col = 0; col < colLen; col++) {
				table[row][col] = sc.nextInt();
			}
		}

		for (int row = 0; row < rowLen; row++) {
			for (int col = 0; col < colLen; col++) {

				System.out.print(table[row][col] +"\t");
			}
			System.out.println();
		}

	}

}
