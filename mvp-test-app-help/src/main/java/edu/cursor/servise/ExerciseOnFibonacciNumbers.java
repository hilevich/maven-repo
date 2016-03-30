package edu.cursor.servise;


import java.util.Scanner;
/**
 * This class contains the method(s) used to solve the problem on Fibonacci numbers.
 * @author Semochko Oleksandr
 *
 */

public class ExerciseOnFibonacciNumbers {
	
    public void fibonacci() {
    	@SuppressWarnings("resource")
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter amount of Fibonacci numbers to show:\n");
		int n = sc.nextInt();
    	int fib, a=1, b=1, i=1;
    	System.out.print("1 1");
		while (i < n-1) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
    }
}
