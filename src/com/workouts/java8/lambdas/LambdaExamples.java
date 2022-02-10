package com.workouts.java8.lambdas;

public class LambdaExamples {

	public static void main(String[] args) {
		
		/*
		(String s) -> s.length()
		(Apple a) -> a.getWeight() > 150
		(int x, int y) -> {
			System.out.println("Result:");
			System.out.println(x+y);
		}
		() -> 42
		(Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
		Syntax:
		parameter -> expression
		parameter -> { statement; }
		
		() -> {}
		() -> "Raoul"
		() -> {return "Mario";}
		(Integer i) -> return "Alan" + i; // InValid(return is a control flow statement )  can be (Integer i) -> {return "Alan" + i;}
		(String s) -> {"Iron Man";} // InValid(is an expression, not a statement) can be (String s) -> { return "Iron Man"; }  or (String s) -> "Iron Man"
		
		(List<String> list) -> list.isEmpty() - A boolean expression
		() -> new Apple(10) - Creating objects
		(Apple a) -> { System.out.println(a.getWeight()); } -> Consuming from an object
		(String s) -> s.length() -> Select/extract from an object
		(int a, int b) -> a*b -> Combine two values
		(Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()); -> Combine two objects
		
		*/
	}
}
