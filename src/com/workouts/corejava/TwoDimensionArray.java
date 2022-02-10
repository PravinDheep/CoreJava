package com.workouts.corejava;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		int x[][] = new int[3][4];
		
		System.out.println("Row Size: " + x.length);
		
		System.out.println("Column Size: " + x[0].length + "\n\n");
		
		int i = 0;
		
		for(int row = 0; row < x.length; row++) {
			for(int col = 0; col < x[0].length; col++) {
				x[row][col] = i;
				i++;
			}
		}
		
		for(int rowx = 0; rowx < x.length; rowx++) {
			for(int colx = 0; colx < x[0].length; colx++) {
				System.out.print(x[rowx][colx]);
				if(colx != x[0].length - 1) {
					System.out.print("  | "); 
				}
			}
			System.out.println();
		}
	}

}
