package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Flipcoin1 {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("enter the number");
		int value = utility.getIntvalue();
		utility.Flipcoin(value);

	}
}