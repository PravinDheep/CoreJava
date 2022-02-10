package com.workouts.corejava;

import java.io.InputStreamReader;
import java.util.Scanner;

public class FibonacciUsingFor {

	public static void main(String[] args) {
		 /* On each iteration, we are assigning second number
         * to the first number and assigning the sum of last two
         * numbers to the second number
         */
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println("Please enter the limit value for printing Fibonacci number :");
		int n = scanner.nextInt();
		System.out.println("The entered value is: " + n);
		int pre = 0, next = 1;

		for (int i = 1; i <= n; ++i) {
			System.out.print(pre +" ");
			int sum = pre + next;
			pre = next;
			next = sum;
		}
		
		   
		// Set it to the number of elements you want in the Fibonacci Series
		/*
		 * int maxNumber = 10; int previousNumber = 0; int nextNumber = 1;
		 * 
		 * System.out.print("Fibonacci Series of " + maxNumber + " numbers:");
		 * 
		 * for (int i = 1; i <= maxNumber; ++i) { System.out.print(previousNumber +
		 * " ");
		 * 
		 * int sum = previousNumber + nextNumber; previousNumber = nextNumber;
		 * nextNumber = sum; }
		 */
	}

}
