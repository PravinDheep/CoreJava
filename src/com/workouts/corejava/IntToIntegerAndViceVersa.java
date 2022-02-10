package com.workouts.corejava;

/**
 * @author PravinDheep
 *
 */
public class IntToIntegerAndViceVersa {

	public static void main(String[] args) {
		Integer integerValue = new Integer(670001);
		
		int intValue = integerValue;
		
		int i = 670000;
		
		Integer integerSecondValue = i; 
		
		System.out.println("Integer Value : " + integerValue + "\n" 
						+ " Int Value : " + intValue + "\n" 
						+ "Integer Second Value :" + integerSecondValue );

	}

}
