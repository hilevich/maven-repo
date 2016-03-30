package edu.cursor.servise;


import java.util.Scanner;
/**
 * This program for search relatively prime numbers 
 * 
 * @author Yura
 * version 1.0.1
 */

public class Exercise323 {

	/**
 	* This class contains the method(s) used to solve the problem in exercise 323.
 	* @author 
 	*
	*/
	public void printInfo(boolean a) {
		if(a){
		System.out.println("Program for search interaction prime numbers");
		}
		else {
			System.out.println("End of Pprogram . . .");
		}
	}
	/**
	 * method scan integer number 
	 */
	public int scanNumber() {
		int number = 0;
		System.out.println("Enter N");
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
		} catch (Exception e) {
			System.out.println("invalid input");
		}
		return number;
	}
	
	/**
	 * this method take two integer and check relatively prime numbers (numberOne and numbetTwo) if return == 1 
	 */
	public int greatestCommonDivisor(int numberOne, int numbetTwo) {
		while (numberOne != numbetTwo) {

			if (numberOne > numbetTwo) {
				numberOne = numberOne - numbetTwo;
			} else {
				numbetTwo = numbetTwo - numberOne;
			}

		}
		return numberOne;
	}

	/**
	 *  this method is realization
	 */
	public void ex323(){
		
		
		printInfo(true);
		int numberRead = scanNumber();
		for (int i = 1; i < numberRead; i++) {
			if (greatestCommonDivisor(i, numberRead) == 1) {
				System.out.println(i);
			}

		}
		printInfo(false);
	}

	
}

