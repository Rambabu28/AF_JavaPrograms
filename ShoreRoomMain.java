package coreJava.oops;

import java.util.Scanner;

public class ShoreRoomMain {

	public static void main(String[] args) {
		// created shoreroom object
		ShoreRoom shoreRoom = new ShoreRoom();
		// calling this method to take user inputs from key board
		shoreRoom.inPut();
		/* calling this method caliculate the discount and provide the final amount to pay*/
		shoreRoom.caliculate();

	}

}

class ShoreRoom {
	// these are the object variables declared
	String customerName;
	long mobileNo;
	double cost;
	double discount;
	double amount;

//this is the default constractor
	public ShoreRoom() {

	}

	public void inPut() {
		// created scanner classs object
		Scanner sc = new Scanner(System.in);
		// taking youser input from the key borad
		System.out.println("enter the customer name");
		customerName = sc.next();

		System.out.println("enter the mobile number");
		mobileNo = sc.nextLong();

		System.out.println("enter the cost");
		cost = sc.nextDouble();
	}

//this method will caliculate the discount and give the amount to pay
	public void caliculate() {
		if (cost == 10000) {
			discount = (5.0 / 100.0) * cost;
			System.out.println("the discount is 5%");
			System.out.println("dis amount:" + discount);
			System.out.println("the total amount to pay is:" + (cost - discount));
		} else if (cost > 10000 && cost <= 20000) {
			discount = (10.0 / 100.0) * cost;
			System.out.println("the discount you got  is 10%");
			System.out.println("the total amount to pay is:" + (cost - discount));
		} else if (cost > 20000 && cost <= 35000) {
			discount = (15.0 / 100.0) * cost;
			System.out.println("the discount you got  is 15%");
			System.out.println("the total amount to pay is:" + (cost - discount));
		} else if (cost > 35000) {
			discount = (20.0 / 100.0) * cost;
			System.out.println("the discount you got  is 20%");
			System.out.println("the total amount to pay is:" + (cost - discount));
		} else {
			System.out.println("the discount you got  is 0%");
			System.out.println("the total amount to pay is:" + (cost));
		}
	}

}
