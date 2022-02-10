package com.workouts.java8.lambdas.BasicFunctionalInterfaces;

@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
