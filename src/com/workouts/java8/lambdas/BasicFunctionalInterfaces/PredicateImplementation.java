package com.workouts.java8.lambdas.BasicFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateImplementation {
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> result = new ArrayList<>();
		for(T s : list) {
			if(p.test(s)) {
				result.add(s);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Predicate<String> appleList = (String str) -> !str.isEmpty();
		List<String> nonEmpty = filter(Arrays.asList("red","green"), appleList);
		for(String st : nonEmpty) {
			System.out.println(st);
		}
	}

}
