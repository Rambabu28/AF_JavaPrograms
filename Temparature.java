package coreJavaBasics.day2Lab2;

public class Temparature {
//this program is about converting Fahrenheit to Celsius.
	public static void main(String[] args) {
		float fahrenheit =98;//here we can give farenheit as input
		
		//fromula to convert Fahrenheit to Celsius
		float sub=fahrenheit-32;
		float mul=sub*5;
		float celsius=mul/9;
		
		//this statement prints celsius value after conversion
		System.out.println("Celsius value for "+"Fahrenheit "+fahrenheit+" is :"+celsius);
	}

}
