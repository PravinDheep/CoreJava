package com.workouts.corejava;

public class BinaryLiteral {

	public static void main(String[] args) {
		int i = 5;
		int j = 0B101; //0B used for binary literal, small B or capital B
		int k = 0B100000000; // Java 1.7 introduced underscore in var values.
		int l = 0B100_000_000;
		
		System.out.println(j +" : " + k + " : " + l);
		

	}

}

