package com.workouts.corejava;

public class PatternExample {

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		 
		System.out.println("-------------------------------------------");
		
		for (int a = 0; a < 4; a++) {
			for (int b = 0; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		 
		System.out.println("-------------------------------------------");
		
		for (int c = 0; c < 4; c++) {
			for (int d = 0; d < 4; d++) {
				if (d == 0 || d == 3 || c == 0 || c == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		 
		System.out.println("-------------------------------------------");
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				int k = (i+j) - 1;
				if(k > 4)
					System.out.print(k-4 + " ");
				else
					System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				if( ((i+j) % 2) == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
				
			}
			System.out.println();
		}
	}
}
