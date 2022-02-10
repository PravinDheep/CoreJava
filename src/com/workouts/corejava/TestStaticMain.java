package com.workouts.corejava;

public class TestStaticMain {
	
	public static void main(String[] args) {
		System.out.println("Main");
		
		int x = 9;
		
		if(x == 9) {
			//int x = 8;
			System.out.println(x);
		}
	}
	
	static {
		System.out.println("Static");
	}
	
	
}
