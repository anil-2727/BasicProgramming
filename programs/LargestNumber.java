package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class LargestNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("enter the numbers"+  "x"  +"y" +"z");
     	int firstNumber = utility.getIntvalue();
     	int secoundNumber = utility.getIntvalue();
     	int thirdNumber = utility.getIntvalue();
     	utility.largestNumber(firstNumber,secoundNumber,thirdNumber);
     	
}
}