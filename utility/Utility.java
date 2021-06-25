package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner; // scanner defined

	public Utility() { // constructor
		scanner = new Scanner(System.in); // constructor scanner //system in is
											// writen to read the input
	}

	public int getIntvalue() { // getIntvalue is to read the input
		return scanner.nextInt(); // to return the value
	}
  
	
	//flip coin
	

	public void Flipcoin(int numberOfFlip) {
		// int numberOfFlip = 0;
		// System.out.println(numberOfFlip);
		// to generate a random value we are using random class
		// Random randomObj = new Random();
		double heads = 0, tails = 0;
		for (int i = 0; i < numberOfFlip; i++) {
			double side = Math.random();
			System.out.println(side);
			if (side > 0.5) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("number of head occurance ::" + heads);
		System.out.println("number of tail occurance ::" + (numberOfFlip - heads));
		double headpercent = ((heads * 100) / numberOfFlip);
		System.out.println("headpercent ::" + headpercent + "%");

		double tailpercent = ((tails * 100) / numberOfFlip);
		System.out.println("tailpercent ::" + tailpercent + "%");

	}



	
	
	
	
	
	
	// leap year
	public void Checkleapyear(int valueofyear) { // logic part of program
		int temp = valueofyear, noofdigit = 0;
		do {
			noofdigit++;
			valueofyear = valueofyear / 10;
		} while (valueofyear != 0);

		if (noofdigit == 4) {
			if ((temp % 4 == 0 || temp % 400 == 0) && (temp % 100 == 0)) {
				System.out.println(temp + "its a leap year");
			} else {
				System.out.println(temp + "its not a leap year");
			}
		}

	}


	
	//power of two
	
	public void poweroftwo(int number) {
        int i = 0;
        int powerofnumber = 0;
        if (number<31){
        	for (i= 0; i < number; i++ ){
        		powerofnumber = (1<<i);
        		System.out.println( "2^"+ i  +"=" + powerofnumber );
        	}
        }
        else
        	System.out.println( "the number is not between 0 to 31" );
	}
	

	//harmonic 
	
	public void harmonic(int number){
		int n = number;
	       
		int i;
		int sum=0;
		
		for(i=1;i<=n;i++)
		{
		sum=sum+1/i;
		}
		System.out.println("sum=" + sum);
		}

	
	//reminder
	
	public void reminderQuotient(int number1,int number2){
		int devidend = number1;
		int divser = number2;	
		int quo,rem;
		quo = devidend / divser;
		System.out.println("The Quo of number is =" + quo);
		rem = devidend % divser;
		System.out.println("The Reminder of number is =" + rem);
}
	
	
	
	//swap of two numbers
	

	public void swapOfwo(int firstNumber, int secondNumber) {
		int tempNumber = firstNumber;
		firstNumber = secondNumber;
		secondNumber = tempNumber;
		System.out.println("After swapping: " + firstNumber + "   " + secondNumber);

	}

   // even or odd
	
	public void OddEven(int number) {

		if (number % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");

		}
	}
	
	
	//vowel
	
	public char getCharvalue() {
		return scanner.next().charAt(0);
	}
	public void vowelConsonant(char alphabet){
		 System.out.println(alphabet);
		char ch = alphabet;
	  if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
		  System.out.println("The Alphabet is vowel");
	  }
	  else if( ch >= 'a' && ch<= 'z' && ch >= 'A' && ch<= 'Z'){
		  System.out.println("The Alphabet is consonant");
		  
	  }
		  else{
			  System.out.println("The entered value is not a Alphabet");
	  }
		
	}
	
	
	//largest among three numbers
	
	

	public void largestNumber(int number1, int number2, int number3) {
		int x = number1;
		int y = number2;
		int z = number3;
		if (x > y && x > z) {
			System.out.println("largest number is=" + x);
		} else if (y > x && y > z) {
			System.out.println("largest number is=" + y);
		} else {
			System.out.println("largest number is=" + z);
		}

	}
	
	
}