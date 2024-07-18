package coreJavaBasics.day2Lab2;

public class GreatestAmong5Numbers {
	//this is the program to find greatest number among 5 numbers
	public static void main(String[] args) {

		int num1 = 10, num2 = 20, num3 = 30, num4 = 40, num5 = 50;
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("num1 is greater:"+num1);
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("num2 is greater:"+num2);
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("num3 is greater:"+num3);
		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("num4 is greater:"+num4);
		} else {
			System.out.println("num5 is greater:"+num5);
		}
	}

}
