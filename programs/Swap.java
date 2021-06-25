package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Swap {
	public static void main(String[] args) {

	Utility utility = new Utility();
	System.out.println("enter the number x and y ");
	int firstNumber = utility.getIntvalue();
	int secondNumber = utility.getIntvalue();
	utility.swapOfwo(firstNumber,secondNumber);

	
}
}