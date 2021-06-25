package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Vowel {         

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.print("enter the alphabet");
     	char alphabet = utility.getCharvalue();
     	utility.vowelConsonant(alphabet);
     	
	}	
}
