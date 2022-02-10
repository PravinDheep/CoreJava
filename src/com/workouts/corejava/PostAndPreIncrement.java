package com.workouts.corejava;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		int i = 5;
		
		int j = i++;
		
		//i+=1; // i = i + 1;
		
		//j++; //Post-increment
		
		System.out.println(j);
		System.out.println(i);
		
		++j; //Pre-increment
		
		System.out.println(j);
	}

}
