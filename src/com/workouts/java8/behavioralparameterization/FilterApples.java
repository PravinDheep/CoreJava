package com.workouts.java8.behavioralparameterization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterApples {
	
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(applePredicate.test(apple)) {
				result.add(apple);
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
		List<Apple> listOfApples = filterApples(inventory, new AppleHeavyWeightPredicate()); 
		Iterator<Apple> iterator = listOfApples.stream().iterator();
		while(iterator.hasNext()) {
			Apple app = iterator.next();
			System.out.println(app.getColor() + "-" + app.getWeight());
		}
		
	}

}
