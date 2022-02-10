package com.workouts.corejava;

public class Test {

	public static void main(String[] args) {
		String s1 = "str";
		String s2 = "hi";
		String s3 = "str";
		
		String s4 = new String("str");
		
		if(s1 == s3) {
			System.out.println("1>>>>>>" + s1);
		}
		
		if(s4 == s1) {
			System.out.println("3>>>>>" + s4);
		}
		
		//System.out.println("2>>>>>" + s3 == s1);
		
	}

}
