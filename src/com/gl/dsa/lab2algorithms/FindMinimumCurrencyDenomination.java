package com.gl.dsa.lab2algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindMinimumCurrencyDenomination {

	 static void denominationCounter(Integer[] currencyDenominations, int payableAmount) {
		 
			  int[] numberOfNotes = new int[currencyDenominations.length];
			  			       
			  for (int i = 0; i < currencyDenominations.length; i++) {
			            numberOfNotes[i] = payableAmount / currencyDenominations[i];
			            payableAmount %= currencyDenominations[i];
			  }
			  
			  System.out.println("\nYour payment approach in order to give min no. of notes will be");
			  
			  for (int j = 0; j < currencyDenominations.length; j++) {
				  if(numberOfNotes[j]>0)
					  System.out.println(currencyDenominations[j]+":"+numberOfNotes[j]);
			  }
	 }
			
			
	 public static void main(String[] args) {
				
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter the size of currency denominations");
		        int size = scanner.nextInt();
		        Integer[] currencyDenominations = new Integer[size];

		        System.out.println("Enter the currency denominations value");
		        	for (int i = 0; i < currencyDenominations.length; i++) {
		        		currencyDenominations[i] = scanner.nextInt();
		        	}

		        Arrays.sort(currencyDenominations,Collections.reverseOrder());
		           		             
		        System.out.println("\nEnter the amount you want to pay");
		        int payableAmount = scanner.nextInt();
		        
		        denominationCounter(currencyDenominations, payableAmount);
		        
		        scanner.close();
		        
	}
}


