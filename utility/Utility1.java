package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility1 {


	Scanner scanner;

	public Utility1() {
		scanner = new Scanner(System.in);
	}

	public int getIntvalue() {
		return scanner.nextInt();
	}
	
	
	public <T> void print2DArray(T[][] inputArray, int rows, int columns) {
		PrintWriter printwriter = new PrintWriter(System.out);
		// TODO Auto-generated method stub
		for (int i =0;i<rows;i++)
		{
			for (int j =0;j<columns;j++)
			{ 
				printwriter.write(inputArray[i][j]+" ");
				printwriter.flush();
				//System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
	}

	public Boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public Double getDouble() {
		return scanner.nextDouble();
	}
}
