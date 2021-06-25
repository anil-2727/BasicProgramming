package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class oddEven {
	
	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("enter the number");
		int number = utility.getIntvalue();
		utility.OddEven(number);

}
}