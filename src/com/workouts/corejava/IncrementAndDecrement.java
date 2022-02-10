package com.workouts.corejava;

public class IncrementAndDecrement {

	public static void main(String[] args) {
			int i = 1;
			int j = i++;
			
			System.out.println("I value: " + i + "\t J value: " + j);
			
			int a = 1;
			int b = ++a;
			
			System.out.println("A value: " + a + "\t B value: " + b);
			
			int m= 2;
			int n = m--;
			
			System.out.println("M value: " + m + "\t N value: " + n);
			
			int x= 2;
			int y= --x;
			
			System.out.println("X value: " + x + "\t Y value: " + y);
	}

}
