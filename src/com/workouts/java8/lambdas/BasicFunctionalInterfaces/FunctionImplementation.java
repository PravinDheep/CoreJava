package com.workouts.java8.lambdas.BasicFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionImplementation {

	public static <T, R> List<R> map(List<T> list, Function<T, R> f){
		List<R> result = new ArrayList<>();
		for(T s : list) {
			result.add(f.apply(s));
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> ilist = map(Arrays.asList("lambdas", "in", "action") , (String s) -> s.length());
		
		for(Integer ivalue : ilist) {
			System.out.println(ivalue);
		}
	}

}
