package coreJavaBasics.day2Lab2;

public class LeapYear {
//This program helps to cheak the year leap year or not
	public static void main(String[] args) {
		int year = 2001;// here we can provide year as input
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " Is a Leap year.");
				} else {
					System.out.println(year + " Is a non Leap year.");
				}
			} else {
				System.out.println(year + " Is a Leap year.");
			}
		} else {
			System.out.println(year + " Is a non Leap year.");
		}
	}

}
