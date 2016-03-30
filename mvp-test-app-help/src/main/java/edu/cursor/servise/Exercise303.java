package edu.cursor.servise;

import java.util.Scanner;

public class Exercise303 {
	 
	 
	 public  void ex303() {
	  
	  System.out.println("Positive integer is perfect if it is equal to the sum of all it's dividers, exept itself");
	  
	  System.out.println("Enter the number to find all perfect numbers that are less than it:");
	  
	  @SuppressWarnings("resource")
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  String output = "Perfect sums:";
	  int perfectSum = 0;
	  for (int i = 1; i < num; i++){
	   for (int j = 1; j < i; j++){
	    if((i % j)==0){
	  perfectSum += j;
	  
	    }
	  }
	  if (perfectSum == i){  
	  
	  output += i+",";
	 }
	  
	 perfectSum = 0; 
	} 

	  System.out.println(output);
	 } 
	 
	}
