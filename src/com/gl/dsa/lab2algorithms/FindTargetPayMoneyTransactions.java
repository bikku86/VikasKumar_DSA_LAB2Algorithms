package com.gl.dsa.lab2algorithms;

import java.util.Scanner;

public class FindTargetPayMoneyTransactions {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int size=scanner.nextInt();
	
		int revenueCollection[]=new int[size];
		
		System.out.println("Enter the values of array");
		for (int i = 0; i < revenueCollection.length; i++) {
			revenueCollection[i]=scanner.nextInt();
		}
	
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int totalTargets=scanner.nextInt();
		int sum=0;
		boolean flag=true;
		for(int i=1;i<=totalTargets;i++) {
			System.out.println("\nEnter the value of target");
			int target=scanner.nextInt();
		
			for(int j=0;j<revenueCollection.length;j++)	{
				sum += revenueCollection[j];
					if(sum>=target)	{
						System.out.println("Target achieved after "+(j+1)+" transactions");
						flag=false;
						break;
					}
			}
			
			if(flag)
				System.out.println("Given target is not achieved");	
		}
		
		scanner.close();
	
	}
}


