package com.workouts.corejava;

import java.util.regex.Pattern;

public class ReverseSentence {

	static String reverseWords(String s) {
		Pattern pattern = Pattern.compile("\\s");
		
		String temp[] = pattern.split(s);
		String result = "";
		
		for(String sa : temp) {
			System.out.print(sa);
		}
		System.out.println("--------------------");
		for(int i = 0; i < temp.length; i++) {
			if(i == temp.length - 1) {
				result = temp[i] + result;
		} else {
				result = " " + temp[i] + result;
		}
		}
		return result;
	}
	
	public static void main(String[] args)
    {
        String s1 = "Welcome to geeksforgeeks";
        System.out.println(reverseWords(s1));
  
        String s2 = "I love Java Programming";
        System.out.println(reverseWords(s2));
    }

}
