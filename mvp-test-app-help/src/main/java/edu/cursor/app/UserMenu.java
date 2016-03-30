package edu.cursor.app;
import java.util.Scanner;

import edu.cursor.servise.Exercise182;
import edu.cursor.servise.Exercise303;
import edu.cursor.servise.Exercise323;
import edu.cursor.servise.ExerciseOnFibonacciNumbers;



/**
 * This class contains console menu inside the init method.
 * 
 * @author siakovalina
 */
public class UserMenu {
	public static void main(String args[]) { 
boolean flag = true;
@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);

	

	
		while (flag) {
			System.out.println();
			System.out.println("Enter 1 to see into exercise 182");
			System.out.println("Enter 2 to see into exercise on Fibonacci numbers");
			System.out.println("Enter 3 to see into exercise 323");
			System.out.println("Enter 4 to see into exercise 303");
			System.out.println("Enter 5 to exit the program");
			System.out.println();
			try{
				
			int caseNumber = sc.nextInt();
			if (caseNumber>5||caseNumber <1)
			{
				System.out.println("your chose don't true");
			}
			
			switch (caseNumber) {
			case 1:{
				System.out.println("Your choice exercise 182");
				Exercise182 ex182 = new Exercise182();
				ex182.ex182();
				break;}
			case 2:{
				System.out.println("Your choice Fibonacci numbers");
				ExerciseOnFibonacciNumbers exOnFibNumbers = new ExerciseOnFibonacciNumbers();
				exOnFibNumbers.fibonacci();
				break;}
			case 3:{
				System.out.println("Your choice exercise 323");
				Exercise323 ex323 = new Exercise323();
				ex323.ex323();
				break;}
			case 4:{
				System.out.println("Your choice exercise 303");
				Exercise303 ex303 = new Exercise303();
				ex303.ex303();
				break;}
			case 5:{
				System.out.println("exit the program");
				flag = false;
				
				
				}
			}
			}catch(Exception e){flag = false;
				System.out.println("error input");}
		}
	}
}
