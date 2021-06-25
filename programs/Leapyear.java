package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Leapyear {

	public static void main(String[] args) {
		
		
	   	Utility utility = new Utility();          //instance
	System.out.println("Enter the year");         //print
		int value = utility.getIntvalue();        //variable to store the instance(object)
		utility.Checkleapyear(value);             //call through object
		
		
	}
	
	
	
}
