package com.workouts.corejava;

import java.io.InputStreamReader;
import java.util.Scanner;

public class FibonacciUsingWhile {
	/*
	 * 0 1 1 2 3 5 8 13 21 34 .... N
	 */
	public static void main(String[] args) {
		int a = 1, b = 1, k;
		k = 0;
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println("Please enter the limit value for printing Fibonacci number :");
		int n = scanner.nextInt();
		System.out.println("The entered value is: " + n);
		System.out.print(k + " " + a + " " + b+ " ");
		
		while(k <= n) {
			k = a + b;
			if(k >= n)
				return;
			System.out.print(k + " ");
			a = b;
			b = k;
		}
		 
		
	}

}
