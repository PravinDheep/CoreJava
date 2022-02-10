package com.workouts.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		readInput();
	}

	private static void isAnagram(String text1, String text2) {
		boolean status = false;
		String word1 = text1.replaceAll("\\s", "");
		String word2 = text2.replaceAll("\\s", "");
		
		System.out.println("After Remvoving Spaces: " + word1 + " ::: " + word2);
		
		if(word1.length() != word2.length()) {
			status = false;
		} else {
			char[] charWord1 = word1.toLowerCase().toCharArray();
			char[] charWord2 = word2.toLowerCase().toCharArray();
			
			Arrays.sort(charWord1);
			Arrays.sort(charWord2);
			
			/*
			 * Anagram an = new Anagram();
			 * String wordStr1 = an.toString(charWord1); 
			 * String wordStr2 = an.toString(charWord2);
			 */
			String wordStr1 = String.valueOf(charWord1);
			String wordStr2 = String.valueOf(charWord2);
					
			System.out.println(wordStr1 + "::" + wordStr2);
			
			if(wordStr1.equals(wordStr2)) {
				status = true;
			}
		}
		
		if(status) {
			System.out.println("The given words are anagram");
			readInput();
		} else {
			System.out.println("Given words are Not an Anagram");
			readInput();
		}
	}

	/*
	 * public String toString(char[] charWord) { String str = new String(charWord);
	 * return str; }
	 */
	
	public static void readInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter two words separated by comma: \n");
			System.out.println();
			String[] readWords = br.readLine().split(",");
			if(readWords.length == 2) {
				isAnagram(readWords[0],readWords[1]);
			} else {
				System.out.println("Please enter two words separated with comma: \n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
