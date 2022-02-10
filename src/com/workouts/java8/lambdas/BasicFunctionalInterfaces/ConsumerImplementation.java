package com.workouts.java8.lambdas.BasicFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class ConsumerImplementation {
	
	public static <T> void forEach(List<T> list, Consumer<T> t) {
		for(T i : list) {
			t.accept(i);
		}
	}

	public static void main(String[] args) {
		forEach(Arrays.asList(1,2,3,4,5), (Integer i) -> System.out.println(i));
	}

}
