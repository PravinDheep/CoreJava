package com.workouts.corejava;
public class CyclicStringExample {
	
	static boolean areRotations(String str1,String str2) {
		String s1 = str1 + str1;
		boolean val = s1.indexOf(str2) != -1;
		System.out.println(s1 + ">>>>>>>" + val);
		
		if((str1.length() == str2.length()) && val) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String str1 = "AACD";
		String str2 = "AEDA";
		
		if(areRotations(str1, str2)) {
			System.out.println("Strings are rotations of each other");
		} else {
			System.out.println("Strings are not rotations of each other");
		}
	}

}
