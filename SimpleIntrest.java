package coreJavaBasics.day2Lab2;

public class SimpleIntrest {
//This proram helps to caliculate simple intrest
	public static void main(String[] args) {

		double principle = 100000;// this is the principle amount
		double rateOfIntrest = 24;// this is rate of interst for one year
		float timeDuration = 1.5f;// this is the time duration which was took by barrower.
		
		// this is formula to caliculating  simple interst
		double prod = principle * timeDuration * rateOfIntrest;
		double intrest = prod / 100;
		
		//this is intrest printing part
		System.out.println("Intrest is:"+intrest);
		
		//this is total amount printing part along with intrest 
				System.out.println("Total amount is:"+intrest+principle);
		
	}

}
