package com.workouts.java8.behavioralparameterization.genericway;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterApples {
	
	
	/*public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (applePredicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}*/
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> result = new ArrayList<>();
		for(T e : list) {
			if(p.test(e)) {
				result.add(e);
			}
		}
		return result;
	}
	 
	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>();
		
		Apple a = new Apple("red", 160);
		Apple a1 = new Apple("green", 140);
		Apple a2 = new Apple("Red", 130);
		Apple a3 = new Apple("Green", 170);

		inventory.add(a);
		inventory.add(a1);
		inventory.add(a2);
		inventory.add(a3);
		
//		  List<Apple> listOfApples = filterApples(inventory, new AppleGreenColorPredicate());
//		List<Apple> appleWeightList = filterApples(inventory, new AppleHeavyWeightPredicate());
		//List<Apple> listOfGreenApples = filterApples(inventory, (Apple apple) -> "green".equalsIgnoreCase(apple.getColor()));
		List<Apple> listOfRedApples = filter(inventory, (Apple apple) -> "red".equalsIgnoreCase(apple.getColor()));
		Iterator<Apple> iterator = listOfRedApples.stream().iterator();
		while(iterator.hasNext()) {
			Apple app = iterator.next();
			System.out.println(app.getColor() + "-" + app.getWeight());
		}
		List<Integer> numbers = new ArrayList<Integer>() {
			{
				add(0);
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
				add(6);
				add(7);
				add(8);
				add(9);
			}
		};
		List<Integer> evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
		for(Integer evenNumber : evenNumbers) {
			System.out.print(evenNumber +" ");
		}
	}

}
