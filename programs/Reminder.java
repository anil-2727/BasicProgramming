package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Reminder {         
 
	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("enter the devidend number");
		System.out.println("enter the deviser number");
     	int devidend = utility.getIntvalue();
     	int deviser = utility.getIntvalue();
     	utility.reminderQuotient(devidend,deviser);
     	
}
}